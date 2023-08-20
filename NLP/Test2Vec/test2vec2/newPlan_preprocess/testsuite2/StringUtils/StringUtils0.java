package StringUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtils0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test01");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) '#', "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str3.equals("hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test02");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "" };
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test03");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str1.equals("hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test04");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test05");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test06");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test07");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!       " + "'", str2.equals("hi!       "));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test08");
        int int0 = org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test09");
        char[] charArray2 = new char[] { 'a' };
        boolean boolean3 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(charArray2, 'a', (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test10");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test11");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!       ", "hi!       ", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!       " + "'", str3.equals("hi!       "));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test12");
        short[] shortArray5 = new short[] { (byte) 1, (short) 1, (short) 10, (byte) 100, (byte) 100 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "14141041004100" + "'", str7.equals("14141041004100"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test13");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "14141041004100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test14");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!       ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test15");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test16");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!       ", "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", strArray3, strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str6.equals("hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test17");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("       ", "       ", "14141041004100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test18");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "       ", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test19");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "hi!       ", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!       " + "'", charSequence2.equals("hi!       "));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test20");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "14141041004100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test21");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test22");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "14141041004100", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test23");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "i!hi!hi!hi" + "'", str3.equals("i!hi!hi!hi"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test24");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "14141041004100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test25");
        long[] longArray4 = new long[] { '#', (short) 1, '4', (-1) };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1 52 -1" + "'", str6.equals("35 1 52 -1"));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test26");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "35 1 52 -1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test27");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test28");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "       ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test29");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test30");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("14141041004100", 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "410" + "'", str3.equals("410"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test31");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("35 1 52 -1", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -1" + "'", str2.equals("35 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -1"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test32");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test33");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!       ", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test34");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!       ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!       " + "'", str1.equals("hi!       "));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test35");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "i!hi!hi!hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test36");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 10, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          " + "'", str3.equals("          "));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test37");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!       ", "", "hi!       ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!       " + "'", str3.equals("hi!       "));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test38");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] { '4', 'a', '#' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test39");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "i!hi!hi!hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test40");
        char[] charArray2 = new char[] { 'a' };
        boolean boolean3 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(charArray2, 'a', (int) (short) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test41");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.SPACE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + " " + "'", str0.equals(" "));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test42");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test43");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray2, " ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:  ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test44");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!       ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test45");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "       ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "       " + "'", str2.equals("       "));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test46");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "35 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -1", (java.lang.CharSequence) "14141041004100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test47");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("35 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "35 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -1" + "'", str1.equals("35 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -1"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test48");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("i!hi!hi!hi", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                                          i!hi!hi!hi" + "'", str2.equals("                                                                                          i!hi!hi!hi"));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test49");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test50");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("14141041004100", "                                                                                          i!hi!hi!hi", "14141041004100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test51");
        double[] doubleArray0 = new double[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(doubleArray0, 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test52");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("i!hi!hi!hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "i!hi!hi!hi" + "'", str1.equals("i!hi!hi!hi"));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test53");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!", (int) (short) -1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test54");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("410", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "410" + "'", str2.equals("410"));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test55");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "35 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -1", (java.lang.CharSequence) "410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "35 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -1" + "'", charSequence2.equals("35 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -1"));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test56");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("14141041004100", " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "14141041004100" + "'", str2.equals("14141041004100"));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test57");
        java.lang.CharSequence charSequence0 = null;
        int int1 = org.apache.commons.lang3.StringUtils.length(charSequence0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test58");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "14141041004100", (java.lang.CharSequence) "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test59");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("i!hi!hi!hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "i!hi!hi!hi" + "'", str1.equals("i!hi!hi!hi"));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test60");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "35 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -135 1 52 -1", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test61");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                          i!hi!hi!hi", (int) (byte) 1, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                                                          i!hi!hi!hi" + "'", str3.equals("                                                                                          i!hi!hi!hi"));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test62");
        char[] charArray5 = new char[] { ' ', 'a', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(charArray5, '4', (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test63");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" ", (int) ' ', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "############################### " + "'", str3.equals("############################### "));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test64");
        char[] charArray6 = new char[] { 'a', '4', '4', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test65");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test66");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "35 1 52 -1", (java.lang.CharSequence) "############################### ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test67");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.EMPTY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test68");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!       ", (int) '#', "14141041004100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1414104100410014141041004hi!       " + "'", str3.equals("1414104100410014141041004hi!       "));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test69");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test70");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "          ", (java.lang.CharSequence) "                                                                                          i!hi!hi!hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test71");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!       ", "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "       " + "'", str6.equals("       "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test72");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("35 1 52 -1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test73");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.CR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\r" + "'", str0.equals("\r"));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test74");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "1414104100410014141041004hi!       ", (java.lang.CharSequence) "                                                                                          i!hi!hi!hi", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test75");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!       ", "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (java.lang.CharSequence[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "############################### ", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "       " + "'", str6.equals("       "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test76");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" ", "i!hi!hi!hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test77");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!       ", (java.lang.CharSequence) "14141041004100", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test78");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test79");
        char[] charArray6 = new char[] { 'a', '4', '4', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1414104100410014141041004hi!       ", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils0.test80");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!       ", "hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "       " + "'", str3.equals("       "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }
}

