
package WordUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WordUtils0 {

    public static boolean debug = false;

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test001");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test002");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) '4', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test003");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test004");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test005");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (short) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test006");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test008");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test009");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test010");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test011");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test012");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test013");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test014");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", 0, "h", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhih!" + "'", str4.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test015");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", (int) 'a', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhih!" + "'", str4.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test016");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test017");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test018");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test019");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test020");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test021");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test022");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray2);
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test023");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhih!" + "'", str1.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test024");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("hhih!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test025");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (byte) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test026");
        char[] charArray3 = new char[] { ' ', '4' };
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray3);
        java.lang.Class<?> wildcardClass5 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhih!" + "'", str4.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test027");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHIH!" + "'", str1.equals("hHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test028");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test029");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("H", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test030");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hhih!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test031");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test032");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", (int) '#', "H", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHIH!" + "'", str4.equals("hHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test033");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test034");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("h", (int) (byte) -1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h" + "'", str4.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test035");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHIH!" + "'", str1.equals("hHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test036");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.initials("hHIH!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test037");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray2);
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHIH!" + "'", str4.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test038");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test039");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test040");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (short) 100, "hHIH!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhih!" + "'", str4.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test041");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HI!" + "'", str1.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test042");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", (int) '#', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHIH!" + "'", str4.equals("hHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test043");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HI!" + "'", str1.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test044");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test045");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhih!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhih!" + "'", str8.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test046");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hI!" + "'", str1.equals("hI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test047");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hI!" + "'", str1.equals("hI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test048");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test049");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test050");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) (byte) 100, "h", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "H" + "'", str4.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test051");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test052");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhih!" + "'", str2.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test053");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHIH!" + "'", str8.equals("hHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test054");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test055");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test056");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (byte) 0, "HI!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str4.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test057");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str1.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test058");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hI!", (int) (byte) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hI!" + "'", str4.equals("hI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test059");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hI!" + "'", str1.equals("hI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test060");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test061");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhih!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhih!" + "'", str8.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test062");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test063");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test064");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", 0, "HI!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str4.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test065");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhih!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hhih!" + "'", str6.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test066");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHIH!" + "'", str4.equals("hHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test067");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!hHI!iHI!hHI!!", 0, "H", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str4.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test068");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test069");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hI!", 1, "hHIH!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhHIH!IhHIH!!" + "'", str4.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test070");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHIH!" + "'", str5.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "H" + "'", str6.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test071");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test072");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHIH!" + "'", str8.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test073");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str1.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test074");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHIH!" + "'", str2.equals("hHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test075");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test076");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str4.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test077");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("HI!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHIH!" + "'", str7.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HI!" + "'", str8.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test078");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test079");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test080");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) '4', "hHI!HHI!IHI!HHI!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test081");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) (byte) -1, "Hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HI!" + "'", str4.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test082");
        char[] charArray1 = new char[] {};
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test083");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test084");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("h", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
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
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test085");
        char[] charArray4 = new char[] { '4', '#' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h" + "'", str5.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test086");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("H", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "H" + "'", str2.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test087");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) (byte) 1, "hhih!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "H" + "'", str4.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test088");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hi!", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test089");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!Hhi!Ihi!Hhi!!" + "'", str1.equals("hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test090");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hI!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hI!" + "'", str2.equals("hI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test091");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("hhih!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test092");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HI!" + "'", str2.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test093");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHIH!" + "'", str1.equals("HHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test094");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!Hhi!Ihi!Hhi!!", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!Hhi!Ihi!Hhi!!" + "'", str2.equals("hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test095");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test096");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test097");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hhih!" + "'", str6.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test098");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhih!" + "'", str1.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test099");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test100");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", 0, "hHI!hHI!iHI!hHI!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str4.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test101");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str1.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test102");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test103");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhih!" + "'", str8.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test104");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHIH!", (int) (byte) 0, "Hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHIH!" + "'", str4.equals("HHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test105");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test106");
        char[] charArray4 = new char[] { '4', '#' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h" + "'", str5.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test107");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (byte) 1, "hI!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test108");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (short) -1, "HHI!HHI!IHI!HHI!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test109");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str1.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test110");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test111");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str1.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test112");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test113");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "H" + "'", str2.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test114");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test115");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhih!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhih!" + "'", str8.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test116");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHI!HHI!!", (int) (short) 100, "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str4.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test117");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HI!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hi!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HI!" + "'", str7.equals("HI!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hi!" + "'", str8.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test118");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) '4', "HHIH!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "H" + "'", str4.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test119");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", (int) '#', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hi!" + "'", str4.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test120");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str4.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test121");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHIH!" + "'", str5.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str6.equals("hHI!HHI!IHI!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test122");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str8.equals("HHI!HHI!IHI!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test123");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test124");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("h", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test125");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test126");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hhih!" + "'", str6.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test127");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test128");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHIH!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test129");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test130");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HI!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hi!" + "'", str8.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test131");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test132");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHIH!" + "'", str5.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str6.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test133");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhHIH!IhHIH!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("hhi!Hhi!Ihi!Hhi!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhHIH!IhHIH!!" + "'", str7.equals("hhHIH!IhHIH!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test134");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HI!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hi!" + "'", str2.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test135");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHIH!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test136");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!Hhi!Ihi!Hhi!!" + "'", str1.equals("Hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test137");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test138");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", 100, "hHIH!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str4.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test139");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHIH!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHIH!" + "'", str2.equals("HHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test140");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhih!" + "'", str4.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test141");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("h", 0, "h", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h" + "'", str4.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test142");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHIH!" + "'", str1.equals("HHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test143");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hi!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test144");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test145");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test146");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str1.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test147");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!hHI!iHI!hHI!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str2.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test148");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHIH!" + "'", str1.equals("HHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test149");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test150");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str2.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test151");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!hHI!iHI!hHI!!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str2.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test152");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str2.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test153");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", (int) (short) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhih!" + "'", str4.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test154");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHIH!" + "'", str7.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test155");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test156");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test157");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hhih!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test158");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test159");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str1.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test160");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HI!" + "'", str2.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test161");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!Hhi!Ihi!Hhi!!" + "'", str1.equals("Hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test162");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHhih!iHhih!!" + "'", str1.equals("HHhih!iHhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test163");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhHIH!IhHIH!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hI!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhHIH!IhHIH!!" + "'", str7.equals("hhHIH!IhHIH!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hI!" + "'", str8.equals("hI!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test164");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hi!" + "'", str4.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test165");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("HHI!hHI!iHI!hHI!!", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test166");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test167");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hi!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test168");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test169");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str1.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test170");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test171");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test172");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test173");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test174");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (short) 10, "hhi!Hhi!Ihi!Hhi!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test175");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!hHI!iHI!hHI!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str2.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test176");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test177");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhih!" + "'", str8.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test178");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test179");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "H" + "'", str6.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test180");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhih!" + "'", str8.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test181");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test182");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHhih!iHhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHhih!iHhih!!" + "'", str1.equals("HHhih!iHhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test183");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test184");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhHIH!IhHIH!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHI!hHI!iHI!hHI!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhHIH!IhHIH!!" + "'", str7.equals("hhHIH!IhHIH!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test185");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHIH!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHIH!" + "'", str8.equals("HHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test186");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str1.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test187");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test188");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHI!HHI!!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str2.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test189");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HI!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HI!" + "'", str7.equals("HI!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test190");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test191");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test192");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hi!" + "'", str8.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test193");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", 1, "hHIH!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test194");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test195");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", 0, "Hhih!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str4.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test196");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHhih!iHhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test197");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhHIH!IhHIH!!" + "'", str1.equals("HhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test198");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test199");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 10, "hI!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str4.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test200");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", 1, "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str4.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test201");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("hhi!hhi!ihi!hhi!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHIH!" + "'", str7.equals("HHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "h" + "'", str8.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test202");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test203");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHIH!" + "'", str8.equals("HHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test204");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str6.equals("HHI!HHI!IHI!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test205");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str1.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test206");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHI!HHI!!", (int) (short) 10, "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str4.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test207");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str2.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test208");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test209");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str1.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test210");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHIH!" + "'", str7.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str8.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test211");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test212");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str2.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test213");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str1.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test214");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("hHI!hHI!iHI!hHI!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHIH!" + "'", str7.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test215");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHIH!" + "'", str5.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test216");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test217");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhih!" + "'", str2.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test218");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test219");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hHIH!" + "'", str9.equals("hHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test220");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test221");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str2.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test222");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHhih!iHhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhih!!" + "'", str1.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test223");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHI!HHI!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str2.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test224");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test225");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test226");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhih!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test227");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhih!" + "'", str2.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test228");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", (int) (short) 0, "hhHIH!IhHIH!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hi!" + "'", str4.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test229");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test230");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test231");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str8.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test232");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test233");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) ' ', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test234");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test235");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray2);
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.uncapitalize("h", charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h" + "'", str4.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test236");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test237");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test238");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (short) 100, "hhHIH!IhHIH!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhih!" + "'", str4.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test239");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str1.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test240");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test241");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HI!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHI!hHI!iHI!hHI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HI!" + "'", str7.equals("HI!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test242");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHIH!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHIH!" + "'", str2.equals("HHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test243");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!Hhi!Ihi!Hhi!!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!Hhi!Ihi!Hhi!!" + "'", str2.equals("hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test244");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test245");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test246");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhih!ihhih!!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhih!ihhih!!" + "'", str2.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test247");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", (int) 'a', "hhih!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHIH!" + "'", str4.equals("hHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test248");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test249");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test250");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test251");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("h", (-1), "HHhih!iHhih!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h" + "'", str4.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test252");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test253");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (byte) 1, "h", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhih!" + "'", str4.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test254");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Hhih!" + "'", str9.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test255");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhih!!", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHhih!iHhih!!" + "'", str2.equals("HHhih!iHhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test256");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str1.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test257");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Hhih!" + "'", str9.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test258");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhih!" + "'", str1.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test259");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhHIH!IhHIH!!" + "'", str1.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test260");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str2.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test261");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", (int) 'a', "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str4.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test262");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", (int) (short) 1, "Hhi!hhi!ihi!hhi!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str4.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test263");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test264");
        char[] charArray7 = new char[] { '4', '#', ' ', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray7);
        java.lang.Class<?> wildcardClass9 = charArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhih!" + "'", str8.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test265");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HI!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!hHI!iHI!hHI!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HI!" + "'", str7.equals("HI!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str8.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test266");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str1.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test267");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test268");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) ' ', "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "H" + "'", str4.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test269");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHhih!iHhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhHIH!IhHIH!!" + "'", str1.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test270");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test271");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str5.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str6.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test272");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str1.equals("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test273");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHIH!" + "'", str7.equals("HHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test274");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test275");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test276");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test277");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str1.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test278");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHIH!" + "'", str7.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test279");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) (byte) 1, "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str4.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test280");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhih!!", (int) (short) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHhih!iHhihi!h!!" + "'", str4.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test281");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test282");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("h", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "h" + "'", str8.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test283");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("H", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test284");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test285");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) (byte) 10, "hhi!Hhi!Ihi!Hhi!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test286");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHhih!iHhihi!h!!" + "'", str1.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test287");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", 1, "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test288");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test289");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHI!hHI!iHI!hHI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHIH!" + "'", str7.equals("HHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test290");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test291");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str2.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test292");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("HHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHIH!" + "'", str7.equals("HHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str8.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test293");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str8.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test294");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", (int) (byte) -1, "HI!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhHIH!IhHIH!!" + "'", str4.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test295");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhihi!h!!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHhih!iHhihi!h!!" + "'", str2.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test296");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HhHIH!IhHIH!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str7.equals("HHI!HHI!IHI!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test297");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", (int) (short) 10, "h", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str4.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test298");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test299");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHhih!iHhih!!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHIH!" + "'", str5.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HHhih!iHhih!!" + "'", str6.equals("HHhih!iHhih!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test300");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test301");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!hHI!iHI!hHI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str7.equals("hHI!HHI!IHI!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str8.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test302");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("HHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("h", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHIH!" + "'", str7.equals("HHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "h" + "'", str8.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test303");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test304");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", 0, "h", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test305");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) '4', "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str4.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test306");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) (short) 100, "Hhhih!ihhih!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str4.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test307");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str1.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test308");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test309");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test310");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhih!!", (int) (short) -1, "HHIH!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str4.equals("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test311");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str1.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test312");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test313");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test314");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test315");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhih!ihhih!!", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhih!ihhih!!" + "'", str2.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test316");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) (short) -1, "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str4.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test317");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str2.equals("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test318");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!Hhi!Ihi!Hhi!!", (int) '4', "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhi!Hhi!Ihi!Hhi!!" + "'", str4.equals("Hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test319");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str1.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test320");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test321");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HhHIH!IhHIH!!", (int) (short) 1, "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HhHIH!IhHIH!!" + "'", str4.equals("HhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test322");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", 100, "hHIH!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str4.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test323");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str1.equals("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test324");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) '#', "hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test325");
        char[] charArray4 = new char[] { '4', '#' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h" + "'", str5.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HHIH!" + "'", str6.equals("HHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test326");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str1.equals("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test327");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
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
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test328");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str1.equals("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test329");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hI!", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHIH!" + "'", str5.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hI!" + "'", str6.equals("hI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test330");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test331");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhih!ihhih!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhih!ihhih!!" + "'", str2.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test332");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test333");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHhih!iHhih!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("hHI!hHI!iHI!hHI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHhih!iHhih!!" + "'", str7.equals("HHhih!iHhih!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test334");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test335");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHhih!iHhihi!h!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str7.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHhih!iHhihi!h!!" + "'", str8.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test336");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test337");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 0, "HHhih!iHhih!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test338");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test339");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str7.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test340");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str9.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test341");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHIH!" + "'", str5.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HHIH!" + "'", str6.equals("HHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test342");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test343");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test344");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test345");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", (int) (byte) -1, "hHI!HHI!IHI!HHI!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str4.equals("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test346");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("HhHIH!IhHIH!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HhHIH!IhHIH!!" + "'", str8.equals("HhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test347");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!hHI!iHI!hHI!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str8.equals("HHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test348");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str2.equals("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test349");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test350");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!hhi!ihi!hhi!!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str2.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test351");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1.equals("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test352");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("hHI!hHI!iHI!hHI!!", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHIH!" + "'", str5.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str6.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test353");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test354");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhih!" + "'", str2.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test355");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) (short) -1, "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HI!" + "'", str4.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test356");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str9.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test357");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("h", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h" + "'", str7.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test358");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHhih!iHhihi!h!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHhih!iHhihi!h!!" + "'", str2.equals("hHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test359");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test360");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test361");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!Hhi!Ihi!Hhi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhi!Hhi!Ihi!Hhi!!" + "'", str7.equals("Hhi!Hhi!Ihi!Hhi!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test362");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str7.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test363");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hhih!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test364");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test365");
        char[] charArray4 = new char[] { ' ', '4' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!Hhi!Ihi!Hhi!!", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hhih!" + "'", str5.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhi!Hhi!Ihi!Hhi!!" + "'", str6.equals("Hhi!Hhi!Ihi!Hhi!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test366");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) '4', "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test367");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhih!ihhih!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhih!ihhih!!" + "'", str2.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test368");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test369");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray2);
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test370");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhih!!", (int) (short) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHhih!iHhih!!" + "'", str4.equals("HHhih!iHhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test371");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) 'a', "HHhih!iHhihi!h!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str4.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test372");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str2.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test373");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHIH!" + "'", str7.equals("HHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8.equals("Hhi!hhi!ihi!hhi!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test374");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhih!" + "'", str2.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test375");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test376");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test377");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!hhi!ihi!hhi!!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str2.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test378");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test379");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str2.equals("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test380");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) '#', "HhHIH!IhHIH!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str4.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test381");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test382");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhih!ihhih!!" + "'", str1.equals("hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test383");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test384");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", 100, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test385");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test386");
        org.apache.commons.lang3.text.WordUtils wordUtils0 = new org.apache.commons.lang3.text.WordUtils();
        java.lang.Class<?> wildcardClass1 = wordUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test387");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test388");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test389");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!hHI!iHI!hHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HhHIH!IhHIH!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str7.equals("HHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhih!ihhih!!" + "'", str8.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test390");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhHIH!IhHIH!!" + "'", str1.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test391");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhih!ihhih!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str7.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhih!ihhih!!" + "'", str8.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test392");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhih!!" + "'", str1.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test393");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalize("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str2.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test394");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", 0, "hhi!Hhi!Ihi!Hhi!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!" + "'", str4.equals("Hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test395");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str8.equals("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test396");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str2.equals("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test397");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test398");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("h", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test399");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", 10, "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test400");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhih!" + "'", str2.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test401");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test402");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test403");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str2.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test404");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhihi!h!!", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHhih!iHhihi!h!!" + "'", str2.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test405");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHhih!iHhih!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHhih!iHhihi!h!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHhih!iHhih!!" + "'", str7.equals("HHhih!iHhih!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHhih!iHhihi!h!!" + "'", str8.equals("hHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test406");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhih!ihhih!!", (int) (short) -1, "HHI!hHI!iHI!hHI!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhih!ihhih!!" + "'", str4.equals("hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test407");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!" + "'", str1.equals("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test408");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHhih!iHhihi!h!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHhih!iHhihi!h!!" + "'", str2.equals("hHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test409");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hI!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hI!" + "'", str8.equals("hI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test410");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhih!ihhih!!" + "'", str1.equals("hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test411");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", (int) '#', "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str4.equals("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test412");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test413");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str1.equals("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test414");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1.equals("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test415");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test416");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h" + "'", str7.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhih!" + "'", str8.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test417");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhih!iHhihi!h!!" + "'", str1.equals("hHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test418");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", (int) (byte) 0, "hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!" + "'", str4.equals("Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test419");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str2.equals("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test420");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhih!iHhihi!h!!" + "'", str1.equals("hHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test421");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("HI!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HI!" + "'", str8.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test422");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str2.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test423");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str2.equals("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test424");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test425");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", (int) (byte) 10, "hhih!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str4.equals("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test426");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", 100, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test427");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 1, "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test428");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test429");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) (byte) 100, "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HI!" + "'", str4.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test430");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test431");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) '4', "hhHIH!IhHIH!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhihhHIH!IhHIH!!!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhhHIH!IhHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihihhHIH!IhHIH!!!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhHIH!IhHIH!!hi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhihhHIH!IhHIH!!!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str4.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhihhHIH!IhHIH!!!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhhHIH!IhHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihihhHIH!IhHIH!!!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhHIH!IhHIH!!hi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhihhHIH!IhHIH!!!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test432");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test433");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test434");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhihi!h!!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHhih!iHhihi!h!!" + "'", str2.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test435");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test436");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str2.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test437");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhih!!" + "'", str1.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test438");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test439");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) (byte) -1, "HHI!hHI!iHI!hHI!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!" + "'", str4.equals("hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test440");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!" + "'", str1.equals("HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test441");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHIH!" + "'", str7.equals("HHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "H" + "'", str8.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test442");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test443");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str7.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str8.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test444");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str2.equals("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test445");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test446");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhHIH!IhHIH!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test447");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhih!!" + "'", str1.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test448");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test449");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str2.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test450");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", (int) (byte) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test451");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (short) 10, "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str4.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test452");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test453");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1.equals("hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test454");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test455");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("HHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHIH!" + "'", str7.equals("HHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhih!" + "'", str8.equals("Hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test456");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHhih!iHhih!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHhih!iHhih!!" + "'", str7.equals("HHhih!iHhih!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test457");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) 'a', "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str4.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test458");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!HHI!IHI!HHI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str7.equals("HHI!HHI!IHI!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str8.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test459");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test460");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!" + "'", str1.equals("hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test461");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!hHI!iHI!hHI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str7.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str8.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test462");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!" + "'", str9.equals("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test463");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str1.equals("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test464");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test465");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test466");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test467");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str2.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test468");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test469");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test470");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str2.equals("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test471");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHhih!iHhih!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHhih!iHhih!!" + "'", str7.equals("HHhih!iHhih!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test472");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str1.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test473");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test474");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test475");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str1.equals("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test476");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhHIH!IhHIH!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhHIH!IhHIH!!" + "'", str7.equals("hhHIH!IhHIH!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test477");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhi!Hhi!Ihi!Hhi!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str2.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test478");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str9.equals("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test479");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.initials("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test480");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHIH!" + "'", str8.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test481");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test482");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test483");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test484");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhihi!h!!" + "'", str1.equals("Hhhih!ihhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test485");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test486");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", (int) (byte) 10, "HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str4.equals("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test487");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test488");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str1.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test489");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test490");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str8.equals("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test491");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!" + "'", str1.equals("HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test492");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1.equals("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test493");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHIH!" + "'", str7.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test494");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str1.equals("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test495");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HI!" + "'", str2.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test496");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", (int) (byte) 10, "hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhi!hhi!ihHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!Hi!hi!hhi!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!!IhHi!hi!hhHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hi!ihiHi!!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hhi!!!" + "'", str4.equals("hhhi!hhi!ihHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!Hi!hi!hhi!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!!IhHi!hi!hhHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hi!ihiHi!!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test497");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (-1), "hI!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HhI!IhI!!" + "'", str4.equals("HhI!IhI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test498");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str2.equals("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test499");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) 'a', "Hhi!hhi!ihi!hhi!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.test500");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", 100, "hHhih!iHhihi!h!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str4.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }
}

