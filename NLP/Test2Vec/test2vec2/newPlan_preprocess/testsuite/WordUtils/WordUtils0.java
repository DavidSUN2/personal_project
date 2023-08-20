package WordUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WordUtils0 {

    public static boolean debug = false;

    @Test
    public void WordUtils001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils001");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils002");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) '4', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils003");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void WordUtils004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils004");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils005");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (short) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void WordUtils006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils006");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void WordUtils008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils008");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void WordUtils009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils009");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void WordUtils010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils010");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void WordUtils011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils011");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils012");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils013");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils014");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", 0, "h", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhih!" + "'", str4.equals("hhih!"));
    }

    @Test
    public void WordUtils015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils015");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", (int) 'a', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhih!" + "'", str4.equals("hhih!"));
    }

    @Test
    public void WordUtils016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils016");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils017");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils018");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils019");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils020");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils021");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils022");
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
    public void WordUtils023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils023");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhih!" + "'", str1.equals("hhih!"));
    }

    @Test
    public void WordUtils024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils024");
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
    public void WordUtils025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils025");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (byte) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void WordUtils026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils026");
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
    public void WordUtils027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils027");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHIH!" + "'", str1.equals("hHIH!"));
    }

    @Test
    public void WordUtils028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils028");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils029");
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
    public void WordUtils030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils030");
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
    public void WordUtils031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils031");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils032");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", (int) '#', "H", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHIH!" + "'", str4.equals("hHIH!"));
    }

    @Test
    public void WordUtils033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils033");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void WordUtils034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils034");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("h", (int) (byte) -1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h" + "'", str4.equals("h"));
    }

    @Test
    public void WordUtils035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils035");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHIH!" + "'", str1.equals("hHIH!"));
    }

    @Test
    public void WordUtils036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils036");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.initials("hHIH!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void WordUtils037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils037");
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
    public void WordUtils038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils038");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils039");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils040");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (short) 100, "hHIH!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhih!" + "'", str4.equals("Hhih!"));
    }

    @Test
    public void WordUtils041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils041");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HI!" + "'", str1.equals("HI!"));
    }

    @Test
    public void WordUtils042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils042");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", (int) '#', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHIH!" + "'", str4.equals("hHIH!"));
    }

    @Test
    public void WordUtils043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils043");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HI!" + "'", str1.equals("HI!"));
    }

    @Test
    public void WordUtils044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils044");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void WordUtils045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils045");
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
    public void WordUtils046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils046");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hI!" + "'", str1.equals("hI!"));
    }

    @Test
    public void WordUtils047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils047");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hI!" + "'", str1.equals("hI!"));
    }

    @Test
    public void WordUtils048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils048");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils049");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils050");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) (byte) 100, "h", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "H" + "'", str4.equals("H"));
    }

    @Test
    public void WordUtils051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils051");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils052");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhih!" + "'", str2.equals("Hhih!"));
    }

    @Test
    public void WordUtils053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils053");
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
    public void WordUtils054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils054");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils055");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void WordUtils056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils056");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (byte) 0, "HI!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str4.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils057");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str1.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils058");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hI!", (int) (byte) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hI!" + "'", str4.equals("hI!"));
    }

    @Test
    public void WordUtils059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils059");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hI!" + "'", str1.equals("hI!"));
    }

    @Test
    public void WordUtils060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils060");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils061");
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
    public void WordUtils062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils062");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils063");
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
    public void WordUtils064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils064");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", 0, "HI!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str4.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils065");
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
    public void WordUtils066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils066");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHIH!" + "'", str4.equals("hHIH!"));
    }

    @Test
    public void WordUtils067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils067");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!hHI!iHI!hHI!!", 0, "H", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str4.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils068");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils069");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hI!", 1, "hHIH!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhHIH!IhHIH!!" + "'", str4.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils070");
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
    public void WordUtils071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils071");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils072");
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
    public void WordUtils073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils073");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str1.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils074");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHIH!" + "'", str2.equals("hHIH!"));
    }

    @Test
    public void WordUtils075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils075");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils076");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str4.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils077");
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
    public void WordUtils078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils078");
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
    public void WordUtils079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils079");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils080");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) '4', "hHI!HHI!IHI!HHI!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils081");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) (byte) -1, "Hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HI!" + "'", str4.equals("HI!"));
    }

    @Test
    public void WordUtils082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils082");
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
    public void WordUtils083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils083");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils084");
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
    public void WordUtils085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils085");
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
    public void WordUtils086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils086");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("H", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "H" + "'", str2.equals("H"));
    }

    @Test
    public void WordUtils087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils087");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) (byte) 1, "hhih!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "H" + "'", str4.equals("H"));
    }

    @Test
    public void WordUtils088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils088");
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
    public void WordUtils089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils089");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!Hhi!Ihi!Hhi!!" + "'", str1.equals("hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils090");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hI!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hI!" + "'", str2.equals("hI!"));
    }

    @Test
    public void WordUtils091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils091");
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
    public void WordUtils092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils092");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HI!" + "'", str2.equals("HI!"));
    }

    @Test
    public void WordUtils093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils093");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHIH!" + "'", str1.equals("HHIH!"));
    }

    @Test
    public void WordUtils094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils094");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!Hhi!Ihi!Hhi!!", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!Hhi!Ihi!Hhi!!" + "'", str2.equals("hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils095");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils096");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils097");
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
    public void WordUtils098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils098");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhih!" + "'", str1.equals("hhih!"));
    }

    @Test
    public void WordUtils099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils099");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils100");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", 0, "hHI!hHI!iHI!hHI!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str4.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils101");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str1.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils102");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils103");
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
    public void WordUtils104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils104");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHIH!", (int) (byte) 0, "Hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHIH!" + "'", str4.equals("HHIH!"));
    }

    @Test
    public void WordUtils105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils105");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils106");
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
    public void WordUtils107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils107");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (byte) 1, "hI!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils108");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (short) -1, "HHI!HHI!IHI!HHI!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils109");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str1.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils110");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils111");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str1.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils112");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils113");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "H" + "'", str2.equals("H"));
    }

    @Test
    public void WordUtils114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils114");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils115");
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
    public void WordUtils116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils116");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHI!HHI!!", (int) (short) 100, "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str4.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils117");
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
    public void WordUtils118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils118");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) '4', "HHIH!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "H" + "'", str4.equals("H"));
    }

    @Test
    public void WordUtils119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils119");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", (int) '#', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hi!" + "'", str4.equals("Hi!"));
    }

    @Test
    public void WordUtils120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils120");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str4.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils121");
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
    public void WordUtils122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils122");
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
    public void WordUtils123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils123");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils124");
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
    public void WordUtils125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils125");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils126");
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
    public void WordUtils127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils127");
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
    public void WordUtils128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils128");
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
    public void WordUtils129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils129");
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
    public void WordUtils130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils130");
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
    public void WordUtils131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils131");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils132");
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
    public void WordUtils133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils133");
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
    public void WordUtils134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils134");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HI!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hi!" + "'", str2.equals("Hi!"));
    }

    @Test
    public void WordUtils135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils135");
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
    public void WordUtils136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils136");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!Hhi!Ihi!Hhi!!" + "'", str1.equals("Hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils137");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils138");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", 100, "hHIH!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str4.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils139");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHIH!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHIH!" + "'", str2.equals("HHIH!"));
    }

    @Test
    public void WordUtils140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils140");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhih!" + "'", str4.equals("Hhih!"));
    }

    @Test
    public void WordUtils141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils141");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("h", 0, "h", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h" + "'", str4.equals("h"));
    }

    @Test
    public void WordUtils142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils142");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHIH!" + "'", str1.equals("HHIH!"));
    }

    @Test
    public void WordUtils143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils143");
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
    public void WordUtils144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils144");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils145");
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
    public void WordUtils146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils146");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str1.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils147");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!hHI!iHI!hHI!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str2.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils148");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHIH!" + "'", str1.equals("HHIH!"));
    }

    @Test
    public void WordUtils149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils149");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils150");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str2.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils151");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!hHI!iHI!hHI!!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str2.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils152");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str2.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils153");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", (int) (short) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhih!" + "'", str4.equals("hhih!"));
    }

    @Test
    public void WordUtils154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils154");
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
    public void WordUtils155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils155");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils156");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils157");
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
    public void WordUtils158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils158");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils159");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str1.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils160");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HI!" + "'", str2.equals("HI!"));
    }

    @Test
    public void WordUtils161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils161");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!Hhi!Ihi!Hhi!!" + "'", str1.equals("Hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils162");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHhih!iHhih!!" + "'", str1.equals("HHhih!iHhih!!"));
    }

    @Test
    public void WordUtils163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils163");
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
    public void WordUtils164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils164");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hi!" + "'", str4.equals("Hi!"));
    }

    @Test
    public void WordUtils165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils165");
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
    public void WordUtils166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils166");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils167");
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
    public void WordUtils168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils168");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils169");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str1.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils170");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void WordUtils171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils171");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils172");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils173");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils174");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (short) 10, "hhi!Hhi!Ihi!Hhi!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils175");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!hHI!iHI!hHI!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str2.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils176");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils177");
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
    public void WordUtils178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils178");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils179");
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
    public void WordUtils180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils180");
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
    public void WordUtils181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils181");
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
    public void WordUtils182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils182");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHhih!iHhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHhih!iHhih!!" + "'", str1.equals("HHhih!iHhih!!"));
    }

    @Test
    public void WordUtils183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils183");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void WordUtils184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils184");
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
    public void WordUtils185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils185");
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
    public void WordUtils186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils186");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str1.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils187");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils188");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHI!HHI!!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str2.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils189");
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
    public void WordUtils190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils190");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils191");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils192");
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
    public void WordUtils193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils193");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", 1, "hHIH!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils194");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils195");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", 0, "Hhih!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str4.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils196");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHhih!iHhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils197");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhHIH!IhHIH!!" + "'", str1.equals("HhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils198");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils199");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 10, "hI!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str4.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils200");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", 1, "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str4.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils201");
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
    public void WordUtils202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils202");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils203");
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
    public void WordUtils204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils204");
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
    public void WordUtils205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils205");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str1.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils206");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHI!HHI!!", (int) (short) 10, "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str4.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils207");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str2.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils208");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils209");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str1.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils210");
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
    public void WordUtils211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils211");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils212");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str2.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils213");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str1.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils214");
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
    public void WordUtils215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils215");
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
    public void WordUtils216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils216");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils217");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhih!" + "'", str2.equals("Hhih!"));
    }

    @Test
    public void WordUtils218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils218");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void WordUtils219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils219");
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
    public void WordUtils220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils220");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!hHI!iHI!hHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils221");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str2.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils222");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHhih!iHhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhih!!" + "'", str1.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils223");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHI!HHI!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str2.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils224");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils225");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils226");
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
    public void WordUtils227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils227");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhih!" + "'", str2.equals("hhih!"));
    }

    @Test
    public void WordUtils228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils228");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", (int) (short) 0, "hhHIH!IhHIH!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hi!" + "'", str4.equals("Hi!"));
    }

    @Test
    public void WordUtils229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils229");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str2.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils230");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils231");
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
    public void WordUtils232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils232");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils233");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) ' ', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils234");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils235");
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
    public void WordUtils236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils236");
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
    public void WordUtils237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils237");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils238");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (short) 100, "hhHIH!IhHIH!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhih!" + "'", str4.equals("Hhih!"));
    }

    @Test
    public void WordUtils239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils239");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str1.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils240");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils241");
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
    public void WordUtils242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils242");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHIH!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHIH!" + "'", str2.equals("HHIH!"));
    }

    @Test
    public void WordUtils243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils243");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!Hhi!Ihi!Hhi!!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!Hhi!Ihi!Hhi!!" + "'", str2.equals("hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils244");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils245");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils246");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhih!ihhih!!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhih!ihhih!!" + "'", str2.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils247");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHIH!", (int) 'a', "hhih!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHIH!" + "'", str4.equals("hHIH!"));
    }

    @Test
    public void WordUtils248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils248");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils249");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils250");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void WordUtils251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils251");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("h", (-1), "HHhih!iHhih!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h" + "'", str4.equals("h"));
    }

    @Test
    public void WordUtils252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils252");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils253");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhih!", (int) (byte) 1, "h", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhih!" + "'", str4.equals("Hhih!"));
    }

    @Test
    public void WordUtils254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils254");
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
    public void WordUtils255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils255");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhih!!", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHhih!iHhih!!" + "'", str2.equals("HHhih!iHhih!!"));
    }

    @Test
    public void WordUtils256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils256");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str1.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils257");
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
    public void WordUtils258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils258");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhih!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhih!" + "'", str1.equals("hhih!"));
    }

    @Test
    public void WordUtils259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils259");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhHIH!IhHIH!!" + "'", str1.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils260");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str2.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils261");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", (int) 'a', "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str4.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils262");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", (int) (short) 1, "Hhi!hhi!ihi!hhi!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str4.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils263");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils264");
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
    public void WordUtils265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils265");
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
    public void WordUtils266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils266");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str1.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils267");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils268");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("H", (int) ' ', "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "H" + "'", str4.equals("H"));
    }

    @Test
    public void WordUtils269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils269");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHhih!iHhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhHIH!IhHIH!!" + "'", str1.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils270");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils271");
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
    public void WordUtils272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils272");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str1.equals("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils273");
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
    public void WordUtils274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils274");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils275");
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
    public void WordUtils276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils276");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils277");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str1.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils278");
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
    public void WordUtils279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils279");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) (byte) 1, "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str4.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils280");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhih!!", (int) (short) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHhih!iHhihi!h!!" + "'", str4.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils281");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils282");
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
    public void WordUtils283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils283");
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
    public void WordUtils284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils284");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils285");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) (byte) 10, "hhi!Hhi!Ihi!Hhi!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils286");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHhih!iHhihi!h!!" + "'", str1.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils287");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", 1, "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils288");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils289");
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
    public void WordUtils290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils290");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils291");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str2.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils292");
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
    public void WordUtils293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils293");
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
    public void WordUtils294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils294");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", (int) (byte) -1, "HI!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhHIH!IhHIH!!" + "'", str4.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils295");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhihi!h!!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHhih!iHhihi!h!!" + "'", str2.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils296");
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
    public void WordUtils297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils297");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!hHI!iHI!hHI!!", (int) (short) 10, "h", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str4.equals("HHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils298");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils299");
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
    public void WordUtils300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils300");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils301");
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
    public void WordUtils302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils302");
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
    public void WordUtils303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils303");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils304");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", 0, "h", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void WordUtils305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils305");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) '4', "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str4.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils306");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) (short) 100, "Hhhih!ihhih!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str4.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils307");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str1.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils308");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils309");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils310");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhih!!", (int) (short) -1, "HHIH!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str4.equals("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }

    @Test
    public void WordUtils311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils311");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str1.equals("hHI!hHI!iHI!hHI!!"));
    }

    @Test
    public void WordUtils312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils312");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils313");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils314");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils315");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhih!ihhih!!", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhih!ihhih!!" + "'", str2.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils316");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) (short) -1, "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str4.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils317");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str2.equals("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }

    @Test
    public void WordUtils318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils318");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!Hhi!Ihi!Hhi!!", (int) '4', "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhi!Hhi!Ihi!Hhi!!" + "'", str4.equals("Hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils319");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str1.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils320");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils321");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HhHIH!IhHIH!!", (int) (short) 1, "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HhHIH!IhHIH!!" + "'", str4.equals("HhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils322");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", 100, "hHIH!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str4.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils323");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str1.equals("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }

    @Test
    public void WordUtils324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils324");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) '#', "hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils325");
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
    public void WordUtils326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils326");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str1.equals("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils327");
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
    public void WordUtils328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils328");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str1.equals("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils329");
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
    public void WordUtils330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils330");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils331");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhih!ihhih!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhih!ihhih!!" + "'", str2.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils332");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils333");
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
    public void WordUtils334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils334");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils335");
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
    public void WordUtils336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils336");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils337");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 0, "HHhih!iHhih!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils338");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHIH!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhih!" + "'", str1.equals("Hhih!"));
    }

    @Test
    public void WordUtils339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils339");
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
    public void WordUtils340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils340");
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
    public void WordUtils341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils341");
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
    public void WordUtils342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils342");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils343");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils344");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils345");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", (int) (byte) -1, "hHI!HHI!IHI!HHI!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str4.equals("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils346");
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
    public void WordUtils347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils347");
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
    public void WordUtils348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils348");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str2.equals("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils349");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils350");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!hhi!ihi!hhi!!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str2.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils351");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1.equals("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils352");
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
    public void WordUtils353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils353");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils354");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhih!" + "'", str2.equals("hhih!"));
    }

    @Test
    public void WordUtils355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils355");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) (short) -1, "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HI!" + "'", str4.equals("HI!"));
    }

    @Test
    public void WordUtils356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils356");
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
    public void WordUtils357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils357");
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
    public void WordUtils358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils358");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHhih!iHhihi!h!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHhih!iHhihi!h!!" + "'", str2.equals("hHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils359");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils360");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils361");
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
    public void WordUtils362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils362");
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
    public void WordUtils363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils363");
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
    public void WordUtils364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils364");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils365");
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
    public void WordUtils366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils366");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) '4', "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void WordUtils367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils367");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhih!ihhih!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhih!ihhih!!" + "'", str2.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils368");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils369");
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
    public void WordUtils370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils370");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhih!!", (int) (short) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHhih!iHhih!!" + "'", str4.equals("HHhih!iHhih!!"));
    }

    @Test
    public void WordUtils371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils371");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) 'a', "HHhih!iHhihi!h!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str4.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils372");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str2.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils373");
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
    public void WordUtils374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils374");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhih!" + "'", str2.equals("hhih!"));
    }

    @Test
    public void WordUtils375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils375");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils376");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils377");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!hhi!ihi!hhi!!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str2.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils378");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("H");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils379");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str2.equals("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils380");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) '#', "HhHIH!IhHIH!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str4.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils381");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils382");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhih!ihhih!!" + "'", str1.equals("hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils383");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils384");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", 100, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils385");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils386");
        org.apache.commons.lang3.text.WordUtils wordUtils0 = new org.apache.commons.lang3.text.WordUtils();
        java.lang.Class<?> wildcardClass1 = wordUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void WordUtils387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils387");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils388");
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
    public void WordUtils389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils389");
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
    public void WordUtils390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils390");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhHIH!IhHIH!!" + "'", str1.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils391");
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
    public void WordUtils392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils392");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhih!!" + "'", str1.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils393");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalize("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str2.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils394");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", 0, "hhi!Hhi!Ihi!Hhi!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!" + "'", str4.equals("Hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!"));
    }

    @Test
    public void WordUtils395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils395");
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
    public void WordUtils396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils396");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str2.equals("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils397");
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
    public void WordUtils398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils398");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("h", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void WordUtils399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils399");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("", 10, "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void WordUtils400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils400");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhih!" + "'", str2.equals("hhih!"));
    }

    @Test
    public void WordUtils401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils401");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils402");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils403");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str2.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils404");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhihi!h!!", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHhih!iHhihi!h!!" + "'", str2.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils405");
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
    public void WordUtils406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils406");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhih!ihhih!!", (int) (short) -1, "HHI!hHI!iHI!hHI!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhih!ihhih!!" + "'", str4.equals("hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils407");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!" + "'", str1.equals("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!"));
    }

    @Test
    public void WordUtils408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils408");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHhih!iHhihi!h!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHhih!iHhihi!h!!" + "'", str2.equals("hHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils409");
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
    public void WordUtils410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils410");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhih!ihhih!!" + "'", str1.equals("hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils411");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", (int) '#', "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str4.equals("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils412");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils413");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str1.equals("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils414");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1.equals("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils415");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils416");
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
    public void WordUtils417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils417");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhih!iHhihi!h!!" + "'", str1.equals("hHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils418");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", (int) (byte) 0, "hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!" + "'", str4.equals("Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!"));
    }

    @Test
    public void WordUtils419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils419");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str2.equals("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils420");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhih!iHhihi!h!!" + "'", str1.equals("hHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils421");
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
    public void WordUtils422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils422");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str2.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils423");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str2.equals("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils424");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils425");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", (int) (byte) 10, "hhih!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str4.equals("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils426");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", 100, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils427");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 1, "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils428");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils429");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) (byte) 100, "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HI!" + "'", str4.equals("HI!"));
    }

    @Test
    public void WordUtils430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils430");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils431");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) '4', "hhHIH!IhHIH!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhihhHIH!IhHIH!!!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhhHIH!IhHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihihhHIH!IhHIH!!!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhHIH!IhHIH!!hi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhihhHIH!IhHIH!!!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str4.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhihhHIH!IhHIH!!!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhhHIH!IhHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihihhHIH!IhHIH!!!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhHIH!IhHIH!!hi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhihhHIH!IhHIH!!!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils432");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils433");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils434");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHhih!iHhihi!h!!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHhih!iHhihi!h!!" + "'", str2.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils435");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils436");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHI!HHI!!", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str2.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils437");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhih!!" + "'", str1.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils438");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils439");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) (byte) -1, "HHI!hHI!iHI!hHI!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!" + "'", str4.equals("hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils440");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!" + "'", str1.equals("HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils441");
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
    public void WordUtils442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils442");
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
    public void WordUtils443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils443");
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
    public void WordUtils444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils444");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str2.equals("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils445");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils446");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhHIH!IhHIH!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils447");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhih!!" + "'", str1.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils448");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils449");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str2.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils450");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", (int) (byte) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils451");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (short) 10, "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str4.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils452");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils453");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1.equals("hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils454");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils455");
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
    public void WordUtils456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils456");
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
    public void WordUtils457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils457");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) 'a', "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str4.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils458");
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
    public void WordUtils459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils459");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils460");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!" + "'", str1.equals("hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!"));
    }

    @Test
    public void WordUtils461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils461");
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
    public void WordUtils462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils462");
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
    public void WordUtils463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils463");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str1.equals("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils464");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils465");
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
    public void WordUtils466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils466");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils467");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str2.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils468");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils469");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hi!", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void WordUtils470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils470");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str2.equals("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils471");
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
    public void WordUtils472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils472");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHI!HHI!IHI!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str1.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils473");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils474");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils475");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str1.equals("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils476");
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
    public void WordUtils477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils477");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhi!Hhi!Ihi!Hhi!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str2.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils478");
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
    public void WordUtils479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils479");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.initials("hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void WordUtils480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils480");
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
    public void WordUtils481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils481");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils482");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils483");
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
    public void WordUtils484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils484");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhihi!h!!" + "'", str1.equals("Hhhih!ihhihi!h!!"));
    }

    @Test
    public void WordUtils485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils485");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils486");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", (int) (byte) 10, "HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str4.equals("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils487");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils488");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str1.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils489");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils490");
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
    public void WordUtils491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils491");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!" + "'", str1.equals("HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils492");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1.equals("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils493");
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
    public void WordUtils494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils494");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str1.equals("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils495");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HI!" + "'", str2.equals("HI!"));
    }

    @Test
    public void WordUtils496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils496");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", (int) (byte) 10, "hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhi!hhi!ihHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!Hi!hi!hhi!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!!IhHi!hi!hhHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hi!ihiHi!!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hhi!!!" + "'", str4.equals("hhhi!hhi!ihHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!Hi!hi!hhi!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!!IhHi!hi!hhHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hi!ihiHi!!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hhi!!!"));
    }

    @Test
    public void WordUtils497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils497");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (-1), "hI!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HhI!IhI!!" + "'", str4.equals("HhI!IhI!!"));
    }

    @Test
    public void WordUtils498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils498");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str2.equals("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }

    @Test
    public void WordUtils499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils499");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", (int) 'a', "Hhi!hhi!ihi!hhi!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils0.WordUtils500");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", 100, "hHhih!iHhihi!h!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str4.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }
}

