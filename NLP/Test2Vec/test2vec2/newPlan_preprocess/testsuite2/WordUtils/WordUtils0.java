package WordUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WordUtils0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test01");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test02");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test03");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test04");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test05");
        char[] charArray7 = new char[] { 'a', '4', '#', '#', '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!", charArray7);
        java.lang.Class<?> wildcardClass9 = charArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hi!" + "'", str8.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test06");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test07");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test08");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test09");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test10");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test11");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", 1, "Hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHi!iHi!!" + "'", str4.equals("HHi!iHi!!"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test12");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHi!iHi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHi!iHi!!" + "'", str1.equals("hHi!iHi!!"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test13");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test14");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test15");
        org.apache.commons.lang3.text.WordUtils wordUtils0 = new org.apache.commons.lang3.text.WordUtils();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test16");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test17");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test18");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("h", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test19");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHi!iHi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhI!IhI!!" + "'", str1.equals("hhI!IhI!!"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test20");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "H" + "'", str2.equals("H"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test21");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test22");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test23");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHi!iHi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!ihi!!" + "'", str1.equals("Hhi!ihi!!"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test24");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test25");
        char[] charArray6 = new char[] { 'a', 'a', 'a', ' ', ' ' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray6);
        java.lang.Class<?> wildcardClass8 = charArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test26");
        char[] charArray4 = new char[] { '4', '4' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hi!", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hi!" + "'", str6.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test27");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hi!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hi!" + "'", str4.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test28");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test29");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test30");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test31");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhI!IhI!!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhI!IhI!!" + "'", str2.equals("hhI!IhI!!"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test32");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test33");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhI!IhI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hi!" + "'", str5.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhI!IhI!!" + "'", str8.equals("hhI!IhI!!"));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test34");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHi!iHi!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHi!iHi!!" + "'", str2.equals("hHi!iHi!!"));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test35");
        char[] charArray4 = new char[] { ' ', ' ' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hi!" + "'", str5.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test36");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (byte) 10, "Hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test37");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHi!iHi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHi!iHi!!" + "'", str1.equals("HHi!iHi!!"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test38");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("hhI!IhI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hi!" + "'", str5.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test39");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhI!IhI!!", (int) (byte) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhI!IhI!!" + "'", str4.equals("hhI!IhI!!"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test40");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test41");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!ihi!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!ihi!!" + "'", str2.equals("Hhi!ihi!!"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test42");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hhI!IhI!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HhI!IhI!!" + "'", str8.equals("HhI!IhI!!"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test43");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhI!IhI!!", charArray2);
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hhI!IhI!!" + "'", str3.equals("hhI!IhI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test44");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHi!iHi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhI!IhI!!" + "'", str1.equals("HhI!IhI!!"));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test45");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhI!IhI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhI!IhI!!" + "'", str1.equals("hhI!IhI!!"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test46");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hi!" + "'", str2.equals("Hi!"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test47");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHi!iHi!!", (int) (short) 100, "Hhi!ihi!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHi!iHi!!" + "'", str4.equals("hHi!iHi!!"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test48");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test49");
        char[] charArray5 = new char[] { ' ', ' ' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("hhI!IhI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HhI!IhI!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hi!" + "'", str6.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h" + "'", str7.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhi!ihi!!" + "'", str8.equals("Hhi!ihi!!"));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test50");
        char[] charArray7 = new char[] { ' ', 'a', ' ', ' ', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHi!iHi!!", charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHi!iHi!!" + "'", str8.equals("hHi!iHi!!"));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test51");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("h", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hi!" + "'", str4.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test52");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test53");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHi!iHi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHi!iHi!!" + "'", str1.equals("hHi!iHi!!"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test54");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HhI!IhI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test55");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HhI!IhI!!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HhI!IhI!!" + "'", str2.equals("HhI!IhI!!"));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test56");
        char[] charArray4 = new char[] { ' ', '4' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHi!iHi!!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("h", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHi!iHi!!" + "'", str5.equals("hHi!iHi!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "H" + "'", str6.equals("H"));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test57");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test58");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHi!iHi!!", 100, "h", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHi!iHi!!" + "'", str4.equals("HHi!iHi!!"));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test59");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hi!" + "'", str2.equals("Hi!"));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test60");
        char[] charArray4 = new char[] { '#' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhI!IhI!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHi!iHi!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hi!" + "'", str5.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hhI!IhI!!" + "'", str6.equals("hhI!IhI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHi!iHi!!" + "'", str7.equals("hHi!iHi!!"));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test61");
        char[] charArray4 = new char[] { ' ', ' ' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHi!iHi!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hi!" + "'", str5.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhi!ihi!!" + "'", str6.equals("Hhi!ihi!!"));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test62");
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhI!IhI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray5);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hi!" + "'", str6.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhI!IhI!!" + "'", str7.equals("hhI!IhI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test63");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhI!IhI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHi!iHi!!" + "'", str1.equals("HHi!iHi!!"));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test64");
        char[] charArray1 = new char[] {};
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhI!IhI!!", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhI!IhI!!" + "'", str2.equals("hhI!IhI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test65");
        char[] charArray4 = new char[] { '4', '4' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hi!" + "'", str6.equals("Hi!"));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test66");
        char[] charArray3 = new char[] { ' ', '4' };
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHi!iHi!!", charArray3);
        java.lang.Class<?> wildcardClass5 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHi!iHi!!" + "'", str4.equals("hHi!iHi!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test67");
        char[] charArray4 = new char[] { '4', '4' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("h", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "H" + "'", str6.equals("H"));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test68");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", (int) (short) -1, "Hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHi!iHi!!" + "'", str4.equals("HHi!iHi!!"));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test69");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhI!IhI!!", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!ihi!!", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhI!IhI!!" + "'", str4.equals("hhI!IhI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhi!ihi!!" + "'", str6.equals("Hhi!ihi!!"));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test70");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhi!ihi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test71");
        char[] charArray4 = new char[] { '4', '4' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test72");
        char[] charArray4 = new char[] { ' ', ' ' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hhI!IhI!!", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hi!" + "'", str5.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test73");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!", charArray2);
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Hi!" + "'", str3.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test74");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHi!iHi!!", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hi!" + "'", str4.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HHi!iHi!!" + "'", str6.equals("HHi!iHi!!"));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test75");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!ihi!!", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!ihi!!" + "'", str2.equals("Hhi!ihi!!"));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test76");
        char[] charArray4 = new char[] { ' ', '4' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHi!iHi!!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("HhI!IhI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHi!iHi!!" + "'", str5.equals("hHi!iHi!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HhI!IhI!!" + "'", str6.equals("HhI!IhI!!"));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test77");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (short) -1, "Hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHi!iHi!!" + "'", str4.equals("hHi!iHi!!"));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test78");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test79");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "H" + "'", str2.equals("H"));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test80");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhI!IhI!!", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhI!IhI!!", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhI!IhI!!" + "'", str4.equals("hhI!IhI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hi!" + "'", str5.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hhI!IhI!!" + "'", str6.equals("hhI!IhI!!"));
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test81");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHi!iHi!!", (int) (short) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhi!Hhi!ihi!!hi!ihi!Hhi!ihi!!hi!!" + "'", str4.equals("hhi!Hhi!ihi!!hi!ihi!Hhi!ihi!!hi!!"));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test82");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HhI!IhI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!ihi!!" + "'", str1.equals("Hhi!ihi!!"));
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test83");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("h", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test84");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hI!" + "'", str1.equals("hI!"));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test85");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HI!" + "'", str1.equals("HI!"));
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test86");
        char[] charArray4 = new char[] { '#' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhI!IhI!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hi!" + "'", str5.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hhI!IhI!!" + "'", str6.equals("hhI!IhI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hi!" + "'", str7.equals("Hi!"));
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test87");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("h", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "H" + "'", str2.equals("H"));
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test88");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!ihi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!ihi!!" + "'", str1.equals("Hhi!ihi!!"));
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test89");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHi!iHi!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hi!" + "'", str5.equals("Hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHi!iHi!!" + "'", str8.equals("HHi!iHi!!"));
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test90");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hhi!ihi!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test91");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hi!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hi!" + "'", str2.equals("Hi!"));
    }
}

