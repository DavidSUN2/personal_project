
package StringUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtils0 {

    public static boolean debug = false;

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!", (int) '4', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0003");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "hi!", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "!ih                                                 " + "'", str1.equals("!ih                                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0006");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                 hi!", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                 hi!", "hi!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "", (java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0009");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "                                                 hi!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0010");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.CR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\r" + "'", str0.equals("\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0011");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray0, 'a', (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0012");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.EMPTY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0014");
        java.lang.String[][] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0015");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4a a4aaa#aa", (java.lang.CharSequence) "\r", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0016");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4A A4AAA#AA" + "'", str1.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4A A4AAA#AA", (int) (byte) 1, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4A A4AAA#AA" + "'", str3.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi!", "                                                 hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!ih                                                 ", "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih                                                 " + "'", str2.equals("!ih                                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!", 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "!ih" + "'", str1.equals("!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0023");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\r", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\r", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0026");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4a a4aaa#aa", "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aa" + "'", str2.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0028");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("32.0410.04100.0", (int) (short) -1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.0" + "'", str3.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0030");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\r", (java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "\r" + "'", charSequence2.equals("\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0031");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0032");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "!ih                                                 ", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0033");
        int[] intArray5 = new int[] { (byte) 100, '4', 'a', (byte) 10, (short) 10 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (byte) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0034");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0035");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.LF;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\n" + "'", str0.equals("\n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0036");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                 hi!", "4A A4AAA#AA", "\r", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "                                                 hi!" + "'", str4.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\r", "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0040");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4A A4AAA#AA", "                                                 hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!ih                                                 ", (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0041");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#a" + "'", str1.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("32.0410.04100.0", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.0" + "'", str2.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4a a4aaa#aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aa" + "'", str2.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0045");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "4a a4aaa#aa", "4a a4aaa#aa" };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4a a4aaa#aa", charSequenceArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.appendIfMissing("", (java.lang.CharSequence) "                                                 hi!", charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "                                                 hi!" + "'", str7.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0049");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "32.0410.04100.0", (java.lang.CharSequence) "                                                 hi!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "!ih", (java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\n", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n" + "'", str2.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih", '4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "!ih" + "'", str3.equals("!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0410.04100.0" + "'", str1.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0054");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                 hi!", "-1.0#0.0#1.0#10.0#1.0", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0055");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4A A4AAA#AA", (java.lang.CharSequence) "32.0410.04100.0", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n" + "'", str1.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0057");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(charSequence0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1.0#0.0#1.0#10.0#1.0", (int) (byte) 10, "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str3.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0060");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(charArray5, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " 4#44" + "'", str9.equals(" 4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0061");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (int) (short) 100, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\r", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0063");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("          \n", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0065");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\r");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("                                                 hi!", (java.lang.CharSequence) "\n", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n                                                 hi!" + "'", str9.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0066");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.SPACE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + " " + "'", str0.equals(" "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4a a4aaa#aa", (int) '#', "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str3.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0068");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) " 4#44", (java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0069");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" ", "                                                 hi!", (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "                                                 hi! " + "'", str4.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4a a4aaa#aa", "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aa" + "'", str2.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0072");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!", " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0074");
        float[] floatArray3 = new float[] { ' ', 10.0f, (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', (int) (byte) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0410.04100.0" + "'", str5.equals("32.0410.04100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih", " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih" + "'", str2.equals("!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0076");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray0, '#', (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("32.0410.04100.0", (int) (short) 0, "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.0" + "'", str3.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0078");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0079");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!ih                                                 ", (int) ' ', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "!ih                                                 " + "'", str3.equals("!ih                                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0081");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", charArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(charArray5, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " a#a4" + "'", str9.equals(" a#a4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4A A4AAA#AA", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0083");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "\r");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                 hi! ", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          " + "'", str1.equals("          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0086");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissing("32.0410.04100.032.0410.04a a4aaa#aa", (java.lang.CharSequence) "          \n", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa" + "'", str5.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" 4#44", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("32.0410.04100.032.0410.04a a4aaa#aa", "32.0410.04100.032.0410.04a a4aaa#aa", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str3.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          \n32.0410.04100.032.0410.04a a4aaa#aa", '4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("          \n", 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0092");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0093");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 4#44", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "32.0410.04100.0", charArray6);
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
            System.out.format("%n%s%n", "StringUtils0.test0094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\r" + "'", str1.equals("\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("32.0410.04100.0", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.0" + "'", str2.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "\n                                                 hi!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("-1.0#0.0#1.0#10.0#1.0", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n                                                 hi" + "'", str1.equals("\n                                                 hi"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0102");
        int int0 = org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0103");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0104");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\r", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4A A4AAA#AA", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("32.0410.04100.032.0410.04a a4aaa#aa", "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0107");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) " 4#44", (java.lang.CharSequence) "4A A4AAA#AA", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                 hi!", "          ", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0110");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " 4#44", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                 hi! ", ' ', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################hi!#" + "'", str3.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0112");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence) "\n", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" 4#44", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4#44" + "'", str2.equals(" 4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                 hi!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" ", "#################################################hi!#", "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + " " + "'", str3.equals(" "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("4a a4aaa#aa", "32.0410.04100.032.0410.04a a4aaa#aa", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa" + "'", str3.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0120");
        int[] intArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(intArray0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0121");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "4a a4aaa#aa", "4a a4aaa#aa" };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4a a4aaa#aa", charSequenceArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.prependIfMissing("!ih                                                 ", (java.lang.CharSequence) "!ih                                                 ", charSequenceArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "!ih                                                 " + "'", str7.equals("!ih                                                 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4a a4aaa#aa4a a4aaa#aa" + "'", str8.equals("4a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str1.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0123");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "hi!", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" a#a4", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0127");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "32.0410.04100.0");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("          \n", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0129");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\r");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.prependIfMissing("4a a4aaa#aa", (java.lang.CharSequence) "#################################################hi!#", (java.lang.CharSequence[]) strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#################################################hi!#4a a4aaa#aa" + "'", str9.equals("#################################################hi!#4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0130");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0131");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(charSequence0, (java.lang.CharSequence) " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0132");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "!ih", (java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4a a4aaa#aa4a a4aaa#aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0134");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#################################################hi!#", charSequence1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4", "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0136");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("          \n32.0410.04100.032.0410.04a a4aaa#aa", "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0139");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\r", (java.lang.CharSequence) "4A A4AAA#AA", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0141");
        double[] doubleArray5 = new double[] { (-1), 0.0f, 1, 10.0d, 1.0d };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str7.equals("-1.0#0.0#1.0#10.0#1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str9.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0143");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                 hi!", (java.lang.CharSequence) "4a a4aaa#aa", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str1.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0145");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4a a4aaa#aa4a a4aaa#aa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0146");
        char[] charArray6 = new char[] { '4', ' ', '4', 'a', '#', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(charArray6, 'a');
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4a a4aaa#aa" + "'", str8.equals("4a a4aaa#aa"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0148");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a" + "'", str1.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\n                                                 hi!", "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi!" + "'", str2.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0150");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("-1.0a0.0a1.0a10.0a1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str1.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("-1.0#0.0#1.0#10.0#1.0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "4a a4aaa#a", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\n                                                 hi!", "#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi!" + "'", str2.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0154");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0155");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\n                                                 hi!", "4a a4aaa#aa", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n                                                 hi!" + "'", str3.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0156");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) " a#a4", (java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str1.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0159");
        float[] floatArray3 = new float[] { ' ', 10.0f, (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', (int) '4', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0410.04100.0" + "'", str5.equals("32.0410.04100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0160");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ih", (java.lang.CharSequence) " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0161");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "\n                                                 hi!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4", 1, " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4" + "'", str3.equals("4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0164");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n", (java.lang.CharSequence) " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0165");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4a a4aaa#aa", "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#a" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0167");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "\n", charSequence1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0168");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "32.0410.04100.0", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("32.0410.04100.032.0410.04a a4aaa#aa", "", "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str3.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0170");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4a a4aaa#a", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#a" + "'", str1.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0173");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih                                                 ", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0174");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("          \n32.0a10.0a100.032.0a10.0", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("                                                                           \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0178");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\r", (int) (byte) 0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\r" + "'", str3.equals("\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0183");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0184");
        java.lang.CharSequence[] charSequenceArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.prependIfMissing("4a a4aaa#aa", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0", charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0185");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0187");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n", "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(charSequence0, (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0190");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "4a a4aaa#aa", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          \n", (-1), "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n" + "'", str3.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0192");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0", (java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0193");
        char[] charArray4 = new char[] { ' ', '#', '4' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(charArray4, '#', (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0194");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                                 hi!" + "'", str1.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("-1.0#0.0#1.0#10.0#1.0", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0197");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("32.0410.04100.0", 0, "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.0" + "'", str3.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0198");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("32.0410.04100.0", "4", "", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32.010.0100.0" + "'", str4.equals("32.010.0100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4a a4aaa#a", " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4aaa#a" + "'", str2.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0200");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("a a4aaa#a", "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("          ", "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          " + "'", str2.equals("          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4a a4aaa#a", "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#a" + "'", str2.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0207");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a", (java.lang.CharSequence) " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str4.equals("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0209");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa", (int) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################################################hi!#4a a4aaa#aa" + "'", str1.equals("#################################################hi!#4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0211");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "32.0a10.0a100.0", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0212");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "32.0410.04100.032.0410.04a a4aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 32.0410.04100.032.0410.04a a4aaa#aa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\n                                                 hi!", (int) (byte) 100, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3.equals("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0215");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "4a a4aaa#aa", "4a a4aaa#aa" };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4a a4aaa#aa", charSequenceArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.prependIfMissing("#################################################hi!#", (java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", charSequenceArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#" + "'", str7.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(" a#a4", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#a4" + "'", str2.equals(" a#a4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0217");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0219");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.appendIfMissing(" ", (java.lang.CharSequence) "32.0410.04100.0", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + " 32.0410.04100.0" + "'", str4.equals(" 32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0222");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "4a a4aaa#a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4a a4aaa#a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0223");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4a a4aaa#a", "hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih", "                                                 hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          \n", strArray3, strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "          \n" + "'", str7.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0225");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "!ih", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#a" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "          \n");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "                                                 hi!" + "'", str4.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "                                                 hi!" + "'", str6.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0229");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("          ", (int) (byte) -1, 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          " + "'", str3.equals("          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("32.0a10.0a100.032.0a10.0aaaaaaa#a", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  " + "'", str2.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" ", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0233");
        java.lang.CharSequence charSequence1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("32.0410.04100.0", '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissing("                                                 hi!", charSequence1, (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "                                                 hi!" + "'", str5.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("32.0a10.0a100.032.0a10.0aa aaaaa#aa", "hi!", "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0235");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 hi! ", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4" + "'", str1.equals("4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0237");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0238");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0242");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          \n32.0a10.0a100.032.0a10.0", (int) (short) -1, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 hi!", "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih" + "'", str2.equals("!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0245");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0247");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\n", "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n" + "'", str3.equals("\n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                 hi! ", ' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a" + "'", str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0250");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#aa", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                 hi! ", 32, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi! " + "'", str3.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("          \n32.0410.04100.032.0410.04a a4aaa#aa", 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0253");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0254");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\r");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("          \n", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n" + "'", str2.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0256");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(charSequence0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\r", "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0258");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence) "32.0410.04100.0", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa" + "'", str1.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0260");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "\n", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa " + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "", (java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\r", "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                                 hi! " + "'", str1.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0266");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "", (java.lang.CharSequence) " a#a4", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" 4#44", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                4#44                                                " + "'", str2.equals("                                                4#44                                                "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", " 4#44", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("32.0410.04100.032.0410.04a a4aaa#aa", "32.0a10.0a100.032.0a10.0aaaaaaa#aa", "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0272");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("-1.0a0.0a1.0a10.0a1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str1.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0275");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32.010.0100.0", (java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0276");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "4a a4aaa#aa", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0277");
        char[] charArray1 = new char[] { 'a' };
        char[][] charArray2 = new char[][] { charArray1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0278");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4", "32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0281");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                           \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0" + "'", str1.equals("32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0284");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0", "32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#################################################hi!#", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          " + "'", str1.equals("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0288");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("32.0a10.0a100.032.0a10.0aaaaaaa#a", "\n", " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0289");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "!ih", (java.lang.CharSequence) "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0290");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4a a4aaa#aa", "32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0291");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("32.0410.04100.0", "          ", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0292");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0294");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("          ", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0296");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("32.010.0100.0", 51, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str3.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0297");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (int) (byte) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0298");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0299");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                4#44                                                ", " a#a4", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                4#44                                                " + "'", str3.equals("                                                4#44                                                "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0300");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " 32.0410.04100.0" + "'", str1.equals(" 32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "100", (java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0304");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "\r", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0305");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase(" ", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "                                                 hi!" + "'", str5.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa " + "'", str6.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str2.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0307");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "32.0a10.0a100.0", "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0308");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#a" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n" + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa" + "'", str1.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0311");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih                                                 ", 'a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "!ih                                                 " + "'", str3.equals("!ih                                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0313");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "\n", 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a", "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a" + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0315");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "4A A4AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4A A4AAA#AA");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("-1.0#0.0#1.0#10.0#1.0", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0317");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                4#44                                                ", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!ih                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih                                                 " + "'", str2.equals("!ih                                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0319");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str1.equals("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0320");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                 hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0321");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "\n                                                 hi");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: \n                                                 hi");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0322");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0323");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0324");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4", "\n                                                 hi!", "\n", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4" + "'", str4.equals("4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("32.0410.04100.032.0410.04a a4aaa#aa", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0326");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0410.04100.032.0410.04a a4aaa#aa", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ih", "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0329");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" a#a4", "32.0a10.0a100.032.0a10.0aaaaaaa#aa", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                 hi! ", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi! " + "'", str2.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0336");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4a a4aaa#a", "hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "32.0410.04100.0");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.appendIfMissing("4a a4aaa#aa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n" + "'", str7.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0337");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n", charSequence1, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0338");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0339");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("32.0410.04100.032.0410.04a a4aaa#aa", "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ", 32, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          " + "'", str3.equals("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "4", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str3.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0344");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "4a a4aaa#a", (java.lang.CharSequence) "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa" + "'", str1.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0346");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " 32.0410.04100.0", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0347");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          ", (java.lang.CharSequence) "!ih                                                 ", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0348");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a", (java.lang.CharSequence) "          \n", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 5, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaa" + "'", str3.equals("aaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str1.equals("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("#################################################hi!#", "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#################################################hi!#" + "'", str2.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("32.0a10.0a100.0", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0354");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0355");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" 32.0410.04100.0", (int) (short) 100, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444" + "'", str3.equals("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0358");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(charSequence0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444444444444444444432.010.0100.04444444444444444444", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str2.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0360");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!ih                                                 ", "4", "444444444444444444432.010.0100.04444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0361");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("32.0410.04100.0", '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                           \n32.0a10.0a100.032.0a10.0");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "32.0410.04100.0");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("4a a4aaa#a", strArray3, strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4a a4aaa#a" + "'", str9.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0362");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa", (int) '#', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 61 + "'", int3 == 61);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a a4aaa#a" + "'", str1.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0364");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a", 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0365");
        char[] charArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(charArray0, ' ', (int) (byte) -1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0366");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4a a4aaa#a", (java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0367");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "100", (java.lang.CharSequence) "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" a#a4", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0369");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("          \n32.0410.04100.032.0410.04a a4aaa#aa", (int) (byte) 100, "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  " + "'", str3.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0371");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, 'a', (int) (short) 100, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                           \n32.0a10.0a100.032.0a10.0", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("                                                                           \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("-1.0#0.0#1.0#10.0#1.0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0374");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "100", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("444444444444444444432.010.0100.04444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str1.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0376");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#################################################hi!#4a a4aaa#aa", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444444444444432.010.0100.04444444444444444444", "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str2.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0378");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("a a4aaa#a", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4aaa#a" + "'", str2.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0380");
        float[] floatArray3 = new float[] { ' ', 10.0f, (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0410.04100.0" + "'", str5.equals("32.0410.04100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "32.0a10.0a100.0" + "'", str7.equals("32.0a10.0a100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32.0 10.0 100.0" + "'", str9.equals("32.0 10.0 100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaa", " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaa" + "'", str2.equals("aaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n" + "'", str2.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0383");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a", (java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0384");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", "\r", (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0385");
        org.apache.commons.lang3.StringUtils stringUtils0 = new org.apache.commons.lang3.StringUtils();
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0386");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\r", charArray6);
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
            System.out.format("%n%s%n", "StringUtils0.test0387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                 hi! ", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi!" + "'", str2.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0389");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0390");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4", (java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0392");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("          \n32.0410.04100.032.0410.04a a4aaa#aa", "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0394");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0395");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104 + "'", int3 == 104);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0396");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0 10.0 100.0", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("100.0a10.0", "4a a4aaa#a", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100.0a10.0" + "'", str3.equals("100.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                4#44                                                ", 51, "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                4#44                                                " + "'", str3.equals("                                                4#44                                                "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0400");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0401");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4", (java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0402");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase(" ", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "                                                 hi!" + "'", str5.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa " + "'", str6.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0403");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444" + "'", str1.equals("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                 hi!", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi!" + "'", str2.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("          ", " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          " + "'", str2.equals("          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0407");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0408");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.stripAll(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("          \n32.0410.04100.032.0410.04a a4aaa#aa", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0410");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) " a#a4", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\n                                                 hi!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi!" + "'", str2.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0412");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!ih", charSequenceArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0" + "'", str1.equals("32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a a10.0a100.032.0a10.0a\n32.0" + "'", str2.equals("#a a10.0a100.032.0a10.0a\n32.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0417");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        java.lang.Class<?> wildcardClass8 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0419");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("32.0410.04100.0", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0420");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) 0, 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("32.0a10.0a100.0", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", str2.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                           \n32.0a10.0a100.032.0a10.0", (int) (short) 10, "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.0" + "'", str3.equals("                                                                           \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0423");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0424");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#a a10.0a100.032.0a10.0a\n32.0", 33, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "###a a10.0a100.032.0a10.0a\n32.0##" + "'", str3.equals("###a a10.0a100.032.0a10.0a\n32.0##"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4a a4aaa#a", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#a" + "'", str2.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".0aa aaaaa#a" + "'", str2.equals(".0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0427");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          " + "'", str1.equals("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0429");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0430");
        long[] longArray3 = new long[] { 11, (-1), 33 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 19, (int) (short) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "114-1433" + "'", str9.equals("114-1433"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("32.0410.04100.0", "\n                                                 hi!", "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.0" + "'", str3.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\n", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0434");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("-1.0#0.0#1.0#10.0#1.0", "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str3.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\n                                                 hi", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi" + "'", str2.equals("\n                                                 hi"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0440");
        float[] floatArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(floatArray0, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0441");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" 32.0410.04100.0", "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0447");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "", 11);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#a" + "'", str5.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0449");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n", "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0451");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissing("-1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ", (java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "\r", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str5.equals("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0452");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("32.0a10.0a100.032.0a10.0aaaaaaaa#a", (int) (short) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#a" + "'", str3.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################################################hi!#" + "'", str1.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.0" + "'", str1.equals("32.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("-1.0a0.0a1.0a10.0a1.0", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0a0.0a1.0a10.0a1.0                                                                               " + "'", str2.equals("-1.0a0.0a1.0a10.0a1.0                                                                               "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0456");
        long[] longArray3 = new long[] { 11, (-1), 33 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 19, (int) (short) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "11 -1 33" + "'", str9.equals("11 -1 33"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0458");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) ".0aa aaaaa#a", (java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("32.010.0100.0", "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.010.0100.0" + "'", str2.equals("32.010.0100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0460");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4", "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0461");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                 hi!", 51, 46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "a a4aaa#a", (java.lang.CharSequence) "          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0463");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444432.010.0100.04444444444444444444", (int) (byte) -1, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str3.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0466");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence) "          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0467");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n", "hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0468");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray0, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a', 46, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
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
            System.out.format("%n%s%n", "StringUtils0.test0469");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################################################hi!#4a a4aaa#aa" + "'", str1.equals("#################################################hi!#4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("32.0 10.0 100.0", (int) (short) 10, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100.0" + "'", str3.equals("100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0473");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str1.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4#44" + "'", str1.equals("4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", "100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                 hi!", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi!" + "'", str2.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0#0.0#1.0#10.0#1." + "'", str1.equals("-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", str2.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaa" + "'", str1.equals("aaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0480");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " 4#44" + "'", str1.equals(" 4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0482");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##", (java.lang.CharSequence) "\n                                                 hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0483");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0484");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#################################################hi!#", " 4#44", 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################hi!#" + "'", str3.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#" + "'", str1.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          \n", "32.0a10.0a100.032.0a10.0aaaaaaa#a", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n" + "'", str3.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0487");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               ", charArray6);
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
            System.out.format("%n%s%n", "StringUtils0.test0488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0489");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\n                                                 hi", "32.0410.04100.0", "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n                                                 hi" + "'", str4.equals("\n                                                 hi"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 " + "'", str1.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("100.0a10.0", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0494");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\r", "          \n", (int) (short) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "-1.0#0.0#1.0#10.0#1.0", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0496");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", "\r", "                                                                           \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  " + "'", str3.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0498");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "a a4aaa#a", (int) '#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test0500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" 32.0410.04100.0", "114-1433");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }
}

