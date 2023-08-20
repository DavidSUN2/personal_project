package StringUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtils0 {

    public static boolean debug = false;

    @Test
    public void StringUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!", (int) '4', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0003");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "!ih                                                 " + "'", str1.equals("!ih                                                 "));
    }

    @Test
    public void StringUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0006");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                 hi!", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                 hi!", "hi!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "", (java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0009");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "                                                 hi!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0010");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.CR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\r" + "'", str0.equals("\r"));
    }

    @Test
    public void StringUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0011");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0012");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.EMPTY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void StringUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0014");
        java.lang.String[][] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void StringUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0015");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4a a4aaa#aa", (java.lang.CharSequence) "\r", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0016");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4A A4AAA#AA" + "'", str1.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4A A4AAA#AA", (int) (byte) 1, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4A A4AAA#AA" + "'", str3.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi!", "                                                 hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void StringUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!ih                                                 ", "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih                                                 " + "'", str2.equals("!ih                                                 "));
    }

    @Test
    public void StringUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!", 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "!ih" + "'", str1.equals("!ih"));
    }

    @Test
    public void StringUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0023");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void StringUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\r", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\r", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0026");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4a a4aaa#aa", "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aa" + "'", str2.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0028");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("32.0410.04100.0", (int) (short) -1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.0" + "'", str3.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0030");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\r", (java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "\r" + "'", charSequence2.equals("\r"));
    }

    @Test
    public void StringUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0031");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void StringUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0032");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "!ih                                                 ", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0033");
        int[] intArray5 = new int[] { (byte) 100, '4', 'a', (byte) 10, (short) 10 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (byte) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StringUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0034");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0035");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.LF;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\n" + "'", str0.equals("\n"));
    }

    @Test
    public void StringUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0036");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                 hi!", "4A A4AAA#AA", "\r", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "                                                 hi!" + "'", str4.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\r", "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0040");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4A A4AAA#AA", "                                                 hi!", (int) (byte) 10);
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0041");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#a" + "'", str1.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("32.0410.04100.0", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.0" + "'", str2.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4a a4aaa#aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aa" + "'", str2.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0045");
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
    public void StringUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0049");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "32.0410.04100.0", (java.lang.CharSequence) "                                                 hi!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "!ih", (java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\n", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n" + "'", str2.equals("          \n"));
    }

    @Test
    public void StringUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih", '4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "!ih" + "'", str3.equals("!ih"));
    }

    @Test
    public void StringUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0410.04100.0" + "'", str1.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0054");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                 hi!", "-1.0#0.0#1.0#10.0#1.0", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0055");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4A A4AAA#AA", (java.lang.CharSequence) "32.0410.04100.0", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n" + "'", str1.equals("          \n"));
    }

    @Test
    public void StringUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0057");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(charSequence0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1.0#0.0#1.0#10.0#1.0", (int) (byte) 10, "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str3.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0060");
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
    public void StringUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0061");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (int) (short) 100, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\r", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0063");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("          \n", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0065");
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
    public void StringUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0066");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.SPACE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + " " + "'", str0.equals(" "));
    }

    @Test
    public void StringUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4a a4aaa#aa", (int) '#', "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str3.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0068");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) " 4#44", (java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0069");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" ", "                                                 hi!", (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "                                                 hi! " + "'", str4.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4a a4aaa#aa", "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aa" + "'", str2.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0072");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!", " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void StringUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0074");
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
    public void StringUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih", " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih" + "'", str2.equals("!ih"));
    }

    @Test
    public void StringUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0076");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("32.0410.04100.0", (int) (short) 0, "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.0" + "'", str3.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0078");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void StringUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0079");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!ih                                                 ", (int) ' ', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "!ih                                                 " + "'", str3.equals("!ih                                                 "));
    }

    @Test
    public void StringUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0081");
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
    public void StringUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4A A4AAA#AA", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0083");
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
    public void StringUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                 hi! ", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          " + "'", str1.equals("          "));
    }

    @Test
    public void StringUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0086");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissing("32.0410.04100.032.0410.04a a4aaa#aa", (java.lang.CharSequence) "          \n", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa" + "'", str5.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0087");
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" 4#44", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void StringUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("32.0410.04100.032.0410.04a a4aaa#aa", "32.0410.04100.032.0410.04a a4aaa#aa", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str3.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          \n32.0410.04100.032.0410.04a a4aaa#aa", '4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0091");
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("          \n", 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0092");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0093");
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
    public void StringUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\r" + "'", str1.equals("\r"));
    }

    @Test
    public void StringUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("32.0410.04100.0", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.0" + "'", str2.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "\n                                                 hi!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("-1.0#0.0#1.0#10.0#1.0", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n                                                 hi" + "'", str1.equals("\n                                                 hi"));
    }

    @Test
    public void StringUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0102");
        int int0 = org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void StringUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0103");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0104");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\r", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4A A4AAA#AA", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("32.0410.04100.032.0410.04a a4aaa#aa", "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0107");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) " 4#44", (java.lang.CharSequence) "4A A4AAA#AA", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                 hi!", "          ", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0110");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " 4#44", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void StringUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                 hi! ", ' ', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################hi!#" + "'", str3.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0112");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence) "\n", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" 4#44", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4#44" + "'", str2.equals(" 4#44"));
    }

    @Test
    public void StringUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                 hi!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" ", "#################################################hi!#", "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + " " + "'", str3.equals(" "));
    }

    @Test
    public void StringUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("4a a4aaa#aa", "32.0410.04100.032.0410.04a a4aaa#aa", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa" + "'", str3.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0120");
        int[] intArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(intArray0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0121");
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
    public void StringUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str1.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0123");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "hi!", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" a#a4", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void StringUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0127");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "32.0410.04100.0");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StringUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("          \n", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0129");
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
    public void StringUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0130");
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
    public void StringUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0131");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(charSequence0, (java.lang.CharSequence) " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0132");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "!ih", (java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4a a4aaa#aa4a a4aaa#aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0134");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#################################################hi!#", charSequence1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4", "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0136");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void StringUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("          \n32.0410.04100.032.0410.04a a4aaa#aa", "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0139");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\r", (java.lang.CharSequence) "4A A4AAA#AA", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void StringUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0141");
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
    public void StringUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0143");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                 hi!", (java.lang.CharSequence) "4a a4aaa#aa", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str1.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0145");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4a a4aaa#aa4a a4aaa#aa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0146");
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
    public void StringUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0148");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a" + "'", str1.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\n                                                 hi!", "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi!" + "'", str2.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0150");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("-1.0a0.0a1.0a10.0a1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str1.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("-1.0#0.0#1.0#10.0#1.0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "4a a4aaa#a", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\n                                                 hi!", "#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi!" + "'", str2.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0154");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0155");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\n                                                 hi!", "4a a4aaa#aa", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n                                                 hi!" + "'", str3.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0156");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) " a#a4", (java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str1.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0159");
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
    public void StringUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0160");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ih", (java.lang.CharSequence) " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0161");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "\n                                                 hi!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4", 1, " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4" + "'", str3.equals("4"));
    }

    @Test
    public void StringUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0164");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n", (java.lang.CharSequence) " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void StringUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0165");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4a a4aaa#aa", "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#a" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#a"));
    }

    @Test
    public void StringUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0167");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "\n", charSequence1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0168");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "32.0410.04100.0", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("32.0410.04100.032.0410.04a a4aaa#aa", "", "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str3.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0170");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4a a4aaa#a", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#a" + "'", str1.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0173");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih                                                 ", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0174");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("          \n32.0a10.0a100.032.0a10.0", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("                                                                           \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0178");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\r", (int) (byte) 0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\r" + "'", str3.equals("\r"));
    }

    @Test
    public void StringUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0183");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0184");
        java.lang.CharSequence[] charSequenceArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.prependIfMissing("4a a4aaa#aa", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0", charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0185");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 100, (int) '#');
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0187");
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
    public void StringUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0190");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "4a a4aaa#aa", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          \n", (-1), "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n" + "'", str3.equals("          \n"));
    }

    @Test
    public void StringUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0192");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0", (java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0193");
        char[] charArray4 = new char[] { ' ', '#', '4' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0194");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                                 hi!" + "'", str1.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("-1.0#0.0#1.0#10.0#1.0", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0197");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("32.0410.04100.0", 0, "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.0" + "'", str3.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0198");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("32.0410.04100.0", "4", "", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32.010.0100.0" + "'", str4.equals("32.010.0100.0"));
    }

    @Test
    public void StringUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4a a4aaa#a", " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4aaa#a" + "'", str2.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0200");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("a a4aaa#a", "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("          ", "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          " + "'", str2.equals("          "));
    }

    @Test
    public void StringUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4a a4aaa#a", "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#a" + "'", str2.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0207");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a", (java.lang.CharSequence) " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void StringUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str4.equals("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0209");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa", (int) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void StringUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################################################hi!#4a a4aaa#aa" + "'", str1.equals("#################################################hi!#4a a4aaa#aa"));
    }

    @Test
    public void StringUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0211");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "32.0a10.0a100.0", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void StringUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0212");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\n                                                 hi!", (int) (byte) 100, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3.equals("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0215");
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
    public void StringUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(" a#a4", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#a4" + "'", str2.equals(" a#a4"));
    }

    @Test
    public void StringUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0217");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0219");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.appendIfMissing(" ", (java.lang.CharSequence) "32.0410.04100.0", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + " 32.0410.04100.0" + "'", str4.equals(" 32.0410.04100.0"));
    }

    @Test
    public void StringUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0222");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0223");
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
    public void StringUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0225");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "!ih", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#a" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#a"));
    }

    @Test
    public void StringUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0228");
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
    public void StringUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0229");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("          ", (int) (byte) -1, 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          " + "'", str3.equals("          "));
    }

    @Test
    public void StringUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("32.0a10.0a100.032.0a10.0aaaaaaa#a", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  " + "'", str2.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  "));
    }

    @Test
    public void StringUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0231");
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" ", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void StringUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0233");
        java.lang.CharSequence charSequence1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("32.0410.04100.0", '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissing("                                                 hi!", charSequence1, (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "                                                 hi!" + "'", str5.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("32.0a10.0a100.032.0a10.0aa aaaaa#aa", "hi!", "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0235");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 hi! ", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4" + "'", str1.equals("4"));
    }

    @Test
    public void StringUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0237");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void StringUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0238");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0242");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          \n32.0a10.0a100.032.0a10.0", (int) (short) -1, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 hi!", "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih" + "'", str2.equals("!ih"));
    }

    @Test
    public void StringUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0245");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0247");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\n", "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n" + "'", str3.equals("\n"));
    }

    @Test
    public void StringUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                 hi! ", ' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a" + "'", str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a"));
    }

    @Test
    public void StringUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0250");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#aa", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                 hi! ", 32, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi! " + "'", str3.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("          \n32.0410.04100.032.0410.04a a4aaa#aa", 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0253");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StringUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0254");
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
    public void StringUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("          \n", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n" + "'", str2.equals("          \n"));
    }

    @Test
    public void StringUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0256");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(charSequence0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\r", "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0258");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence) "32.0410.04100.0", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa" + "'", str1.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0260");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "\n", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa " + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa "));
    }

    @Test
    public void StringUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "", (java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\r", "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                                 hi! " + "'", str1.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n"));
    }

    @Test
    public void StringUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0266");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "", (java.lang.CharSequence) " a#a4", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void StringUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" 4#44", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                4#44                                                " + "'", str2.equals("                                                4#44                                                "));
    }

    @Test
    public void StringUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", " 4#44", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("32.0410.04100.032.0410.04a a4aaa#aa", "32.0a10.0a100.032.0a10.0aaaaaaa#aa", "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0272");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("-1.0a0.0a1.0a10.0a1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str1.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0275");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32.010.0100.0", (java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0276");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "4a a4aaa#aa", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0277");
        char[] charArray1 = new char[] { 'a' };
        char[][] charArray2 = new char[][] { charArray1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StringUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0278");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4", "32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void StringUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0281");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                           \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0" + "'", str1.equals("32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0284");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0", "32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#################################################hi!#", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          " + "'", str1.equals("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          "));
    }

    @Test
    public void StringUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0288");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("32.0a10.0a100.032.0a10.0aaaaaaa#a", "\n", " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0289");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "!ih", (java.lang.CharSequence) "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0290");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4a a4aaa#aa", "32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0291");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("32.0410.04100.0", "          ", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0292");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void StringUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0294");
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
    public void StringUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("          ", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0296");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("32.010.0100.0", 51, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str3.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0297");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (int) (byte) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0298");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0299");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                4#44                                                ", " a#a4", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                4#44                                                " + "'", str3.equals("                                                4#44                                                "));
    }

    @Test
    public void StringUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0300");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " 32.0410.04100.0" + "'", str1.equals(" 32.0410.04100.0"));
    }

    @Test
    public void StringUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "100", (java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0304");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "\r", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0305");
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
    public void StringUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str2.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0307");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "32.0a10.0a100.0", "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void StringUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0308");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#a" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#a"));
    }

    @Test
    public void StringUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n" + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n"));
    }

    @Test
    public void StringUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa" + "'", str1.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0311");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih                                                 ", 'a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "!ih                                                 " + "'", str3.equals("!ih                                                 "));
    }

    @Test
    public void StringUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0313");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "\n", 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a", "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a" + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a"));
    }

    @Test
    public void StringUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0315");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("-1.0#0.0#1.0#10.0#1.0", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0317");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                4#44                                                ", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void StringUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!ih                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih                                                 " + "'", str2.equals("!ih                                                 "));
    }

    @Test
    public void StringUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0319");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str1.equals("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0320");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                 hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0321");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0322");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0323");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0324");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4", "\n                                                 hi!", "\n", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4" + "'", str4.equals("4"));
    }

    @Test
    public void StringUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("32.0410.04100.032.0410.04a a4aaa#aa", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0326");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0410.04100.032.0410.04a a4aaa#aa", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ih", "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0329");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" a#a4", "32.0a10.0a100.032.0a10.0aaaaaaa#aa", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void StringUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                 hi! ", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi! " + "'", str2.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0336");
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
    public void StringUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0337");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n", charSequence1, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0338");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0339");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("32.0410.04100.032.0410.04a a4aaa#aa", "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ", 32, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          " + "'", str3.equals("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          "));
    }

    @Test
    public void StringUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "4", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str3.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0344");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "4a a4aaa#a", (java.lang.CharSequence) "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa" + "'", str1.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0346");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " 32.0410.04100.0", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0347");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          ", (java.lang.CharSequence) "!ih                                                 ", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0348");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a", (java.lang.CharSequence) "          \n", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 5, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaa" + "'", str3.equals("aaaaa"));
    }

    @Test
    public void StringUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str1.equals("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("#################################################hi!#", "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#################################################hi!#" + "'", str2.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("32.0a10.0a100.0", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0354");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void StringUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0355");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" 32.0410.04100.0", (int) (short) 100, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444" + "'", str3.equals("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444"));
    }

    @Test
    public void StringUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0358");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(charSequence0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444444444444444444432.010.0100.04444444444444444444", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str2.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0360");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!ih                                                 ", "4", "444444444444444444432.010.0100.04444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0361");
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
    public void StringUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0362");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa", (int) '#', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 61 + "'", int3 == 61);
    }

    @Test
    public void StringUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a a4aaa#a" + "'", str1.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0364");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a", 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0365");
        char[] charArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(charArray0, ' ', (int) (byte) -1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void StringUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0366");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4a a4aaa#a", (java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0367");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "100", (java.lang.CharSequence) "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" a#a4", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0369");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("          \n32.0410.04100.032.0410.04a a4aaa#aa", (int) (byte) 100, "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  " + "'", str3.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  "));
    }

    @Test
    public void StringUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0371");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, 'a', (int) (short) 100, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StringUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                           \n32.0a10.0a100.032.0a10.0", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("                                                                           \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("-1.0#0.0#1.0#10.0#1.0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0374");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "100", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("444444444444444444432.010.0100.04444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str1.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0376");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#################################################hi!#4a a4aaa#aa", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444444444444432.010.0100.04444444444444444444", "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str2.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0378");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void StringUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("a a4aaa#a", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4aaa#a" + "'", str2.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0380");
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
    public void StringUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaa", " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaa" + "'", str2.equals("aaaaa"));
    }

    @Test
    public void StringUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n" + "'", str2.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n"));
    }

    @Test
    public void StringUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0383");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a", (java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0384");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", "\r", (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StringUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0385");
        org.apache.commons.lang3.StringUtils stringUtils0 = new org.apache.commons.lang3.StringUtils();
    }

    @Test
    public void StringUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0386");
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
    public void StringUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                 hi! ", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi!" + "'", str2.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0389");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0390");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4", (java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0392");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("          \n32.0410.04100.032.0410.04a a4aaa#aa", "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0394");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0395");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104 + "'", int3 == 104);
    }

    @Test
    public void StringUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0396");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0 10.0 100.0", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("100.0a10.0", "4a a4aaa#a", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100.0a10.0" + "'", str3.equals("100.0a10.0"));
    }

    @Test
    public void StringUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                4#44                                                ", 51, "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                4#44                                                " + "'", str3.equals("                                                4#44                                                "));
    }

    @Test
    public void StringUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0400");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0401");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4", (java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0402");
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
    public void StringUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0403");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444" + "'", str1.equals("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444"));
    }

    @Test
    public void StringUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                 hi!", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi!" + "'", str2.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("          ", " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          " + "'", str2.equals("          "));
    }

    @Test
    public void StringUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0407");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0408");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.stripAll(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void StringUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("          \n32.0410.04100.032.0410.04a a4aaa#aa", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0410");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) " a#a4", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\n                                                 hi!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi!" + "'", str2.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0412");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!ih", charSequenceArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0" + "'", str1.equals("32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a a10.0a100.032.0a10.0a\n32.0" + "'", str2.equals("#a a10.0a100.032.0a10.0a\n32.0"));
    }

    @Test
    public void StringUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0417");
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
    public void StringUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0419");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("32.0410.04100.0", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void StringUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0420");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) 0, 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("32.0a10.0a100.0", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", str2.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                           \n32.0a10.0a100.032.0a10.0", (int) (short) 10, "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.0" + "'", str3.equals("                                                                           \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0423");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0424");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#a a10.0a100.032.0a10.0a\n32.0", 33, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "###a a10.0a100.032.0a10.0a\n32.0##" + "'", str3.equals("###a a10.0a100.032.0a10.0a\n32.0##"));
    }

    @Test
    public void StringUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4a a4aaa#a", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#a" + "'", str2.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".0aa aaaaa#a" + "'", str2.equals(".0aa aaaaa#a"));
    }

    @Test
    public void StringUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0427");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          " + "'", str1.equals("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          "));
    }

    @Test
    public void StringUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0429");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0430");
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
    public void StringUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("32.0410.04100.0", "\n                                                 hi!", "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0410.04100.0" + "'", str3.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\n", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0434");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("-1.0#0.0#1.0#10.0#1.0", "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", str3.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\n                                                 hi", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi" + "'", str2.equals("\n                                                 hi"));
    }

    @Test
    public void StringUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0440");
        float[] floatArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(floatArray0, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0441");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" 32.0410.04100.0", "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0447");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "", 11);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#a" + "'", str5.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#a"));
    }

    @Test
    public void StringUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0449");
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
    public void StringUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0451");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissing("-1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ", (java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0452");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("32.0a10.0a100.032.0a10.0aaaaaaaa#a", (int) (short) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#a" + "'", str3.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#a"));
    }

    @Test
    public void StringUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################################################hi!#" + "'", str1.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.0" + "'", str1.equals("32.0a10.0a100.0"));
    }

    @Test
    public void StringUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("-1.0a0.0a1.0a10.0a1.0", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0a0.0a1.0a10.0a1.0                                                                               " + "'", str2.equals("-1.0a0.0a1.0a10.0a1.0                                                                               "));
    }

    @Test
    public void StringUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0456");
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
    public void StringUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0457");
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0458");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) ".0aa aaaaa#a", (java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("32.010.0100.0", "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.010.0100.0" + "'", str2.equals("32.010.0100.0"));
    }

    @Test
    public void StringUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0460");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4", "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0461");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                 hi!", 51, 46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "a a4aaa#a", (java.lang.CharSequence) "          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0463");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444432.010.0100.04444444444444444444", (int) (byte) -1, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str3.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0466");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence) "          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0467");
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
    public void StringUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0468");
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
    public void StringUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0469");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################################################hi!#4a a4aaa#aa" + "'", str1.equals("#################################################hi!#4a a4aaa#aa"));
    }

    @Test
    public void StringUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!"));
    }

    @Test
    public void StringUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("32.0 10.0 100.0", (int) (short) 10, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100.0" + "'", str3.equals("100.0"));
    }

    @Test
    public void StringUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0473");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str1.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!"));
    }

    @Test
    public void StringUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4#44" + "'", str1.equals("4#44"));
    }

    @Test
    public void StringUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", "100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                 hi!", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi!" + "'", str2.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0#0.0#1.0#10.0#1." + "'", str1.equals("-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", str2.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaa" + "'", str1.equals("aaaaa"));
    }

    @Test
    public void StringUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0480");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " 4#44" + "'", str1.equals(" 4#44"));
    }

    @Test
    public void StringUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0482");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##", (java.lang.CharSequence) "\n                                                 hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0483");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0484");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#################################################hi!#", " 4#44", 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################hi!#" + "'", str3.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#" + "'", str1.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#"));
    }

    @Test
    public void StringUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          \n", "32.0a10.0a100.032.0a10.0aaaaaaa#a", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n" + "'", str3.equals("          \n"));
    }

    @Test
    public void StringUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0487");
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
    public void StringUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0489");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\n                                                 hi", "32.0410.04100.0", "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n                                                 hi" + "'", str4.equals("\n                                                 hi"));
    }

    @Test
    public void StringUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 " + "'", str1.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 "));
    }

    @Test
    public void StringUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("100.0a10.0", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0494");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\r", "          \n", (int) (short) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // The following exception was thrown during execution in StringUtils generation
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
    public void StringUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0496");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", "\r", "                                                                           \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  " + "'", str3.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  "));
    }

    @Test
    public void StringUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0498");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "a a4aaa#a", (int) '#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.StringUtils0500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" 32.0410.04100.0", "114-1433");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }
}

