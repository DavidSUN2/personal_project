
package WordUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WordUtils1 {

    public static boolean debug = false;

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test501");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HI!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray4);
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
            System.out.format("%n%s%n", "WordUtils1.test502");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str1.equals("hHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test503");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1.equals("HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test504");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHIH!", (int) (short) 1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHIH!" + "'", str4.equals("HHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test505");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test506");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HhI!IhI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHi!iHi!!" + "'", str1.equals("hHi!iHi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test507");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhHIH!IhHIHI!H!!" + "'", str1.equals("hhHIH!IhHIHI!H!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test508");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIH!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIH!!" + "'", str2.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test509");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str7.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str8.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test510");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test511");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhih!ihhih!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhih!ihhih!!" + "'", str2.equals("hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test512");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray5);
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
            System.out.format("%n%s%n", "WordUtils1.test513");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!" + "'", str1.equals("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test514");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhih!ihhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhihi!h!!" + "'", str1.equals("Hhhih!ihhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test515");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", 100, "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!" + "'", str4.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test516");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhih!!" + "'", str1.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test517");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str8.equals("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test518");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", 0, "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str4.equals("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test519");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!", (int) (byte) 10, "hHhih!iHhihi!h!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!" + "'", str4.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test520");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HhHIH!IhHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhih!iHhih!!" + "'", str1.equals("hHhih!iHhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test521");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HI!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHIH!", charArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test522");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!" + "'", str1.equals("HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test523");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str7.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!" + "'", str8.equals("Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test524");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhhih!ihhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHIH!IHHIHI!H!!" + "'", str1.equals("hHHIH!IHHIHI!H!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test525");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test526");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test527");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!" + "'", str2.equals("HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test528");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str7.equals("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test529");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test530");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (int) (short) 1, "Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", true);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test531");
        char[] charArray3 = new char[] { '4', '#' };
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray3);
        java.lang.Class<?> wildcardClass5 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h" + "'", str4.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test532");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hi!", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hi!" + "'", str2.equals("Hi!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test533");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hI!", (int) (short) -1, "hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!Ihhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!!" + "'", str4.equals("hhhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!Ihhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test534");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("h", charArray3);
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
            System.out.format("%n%s%n", "WordUtils1.test535");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HhI!IhI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhI!IhI!!" + "'", str1.equals("hhI!IhI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test536");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHhih!iHhihi!h!!" + "'", str1.equals("HHhih!iHhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test537");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhHIH!IhHIHI!H!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhHIH!IhHIHI!H!!" + "'", str1.equals("HhHIH!IhHIHI!H!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test538");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.capitalize("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str2.equals("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test539");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHIH!IhHIHI!H!!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHIH!IhHIHI!H!!" + "'", str2.equals("hhHIH!IhHIHI!H!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test540");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHIH!IHHIH!!" + "'", str1.equals("HHHIH!IHHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test541");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!hhi!ihi!hhi!!", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str2.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test542");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!hHI!iHI!hHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str7.equals("HHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str8.equals("HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test543");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", (int) (short) -1, "HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str4.equals("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test544");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str8.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test545");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhHIH!IhHIH!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", charArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str8.equals("hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test546");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str7.equals("HHI!HHI!IHI!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test547");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("h", 10, "hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h" + "'", str4.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test548");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhih!hhhih!Hhhih!Ihhih!Hhhih!!hhih!Ihhih!hhhih!Hhhih!Ihhih!Hhhih!!hhih!!" + "'", str1.equals("hhhih!hhhih!Hhhih!Ihhih!Hhhih!!hhih!Ihhih!hhhih!Hhhih!Ihhih!Hhhih!!hhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test549");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1.equals("HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test550");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", (int) (short) 10, "hHI!HHI!IHI!HHI!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhi!hhi!ihHI!HHI!IHI!HHI!!hi!hhi!!IhhHI!HHI!IHI!HHI!!hi!hhi!ihihHI!HHI!IHI!HHI!!!hhi!!!" + "'", str4.equals("hhhi!hhi!ihHI!HHI!IHI!HHI!!hi!hhi!!IhhHI!HHI!IHI!HHI!!hi!hhi!ihihHI!HHI!IHI!HHI!!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test551");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str2.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test552");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test553");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhhih!ihhih!!", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhih!ihhih!!" + "'", str2.equals("hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test554");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str7.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8.equals("Hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test555");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1.equals("HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test556");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("H", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H" + "'", str7.equals("H"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str8.equals("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test557");
        char[] charArray6 = new char[] { '#', 'a', '4', 'a' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhHIH!IhHIH!!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhi!hhi!ihHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!Hi!hi!hhi!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!!IhHi!hi!hhHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hi!ihiHi!!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hhi!!!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhHIH!IhHIH!!" + "'", str7.equals("hhHIH!IhHIH!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hi!hhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!!ihhi!hi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!ihihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hi!hhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!!ihhi!hi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!ihihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test558");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test559");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str8.equals("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test560");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str2.equals("hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test561");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HhHIH!IhHIH!!", 1, "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HhHIH!IhHIH!!" + "'", str4.equals("HhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test562");
        char[] charArray5 = new char[] { 'a', '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray5);
        java.lang.Class<?> wildcardClass8 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str7.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test563");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test564");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhih!ihhih!!", (int) (byte) 0, "HI!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhhih!ihhih!!" + "'", str4.equals("Hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test565");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str8.equals("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test566");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHhih!iHhih!!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hHhih!iHhih!!" + "'", str9.equals("hHhih!iHhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test567");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str1.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test568");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hhih!" + "'", str7.equals("hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str8.equals("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test569");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test570");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1.equals("HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test571");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str6.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str7.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str8.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test572");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", 0, "Hhi!Hhi!Ihi!Hhi!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHhi!Hhi!Ihi!Hhi!!IHhi!Hhi!Ihi!Hhi!!!" + "'", str4.equals("HHhi!Hhi!Ihi!Hhi!!IHhi!Hhi!Ihi!Hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test573");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test574");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("H", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
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
            System.out.format("%n%s%n", "WordUtils1.test575");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", (int) (byte) 100, "hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str4.equals("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test576");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhhih!ihhih!!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhih!ihhih!!" + "'", str2.equals("hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test577");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HI!", (int) (short) 100, "hhhih!ihhih!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HI!" + "'", str4.equals("HI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test578");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str5.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test579");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str6.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test580");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!", 0, "Hhhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!" + "'", str4.equals("hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test581");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test582");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test583");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!" + "'", str2.equals("Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test584");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!Ihhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test585");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhih!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str7.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhih!" + "'", str8.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test586");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test587");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str1.equals("hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test588");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray4);
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
            System.out.format("%n%s%n", "WordUtils1.test589");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str1.equals("hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test590");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHi!iHi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhI!IhI!!" + "'", str1.equals("HhI!IhI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test591");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhih!ihhih!!", (int) (byte) -1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhih!ihhih!!" + "'", str4.equals("hhhih!ihhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test592");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) (short) 0, "hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!hhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!ihHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!hhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!hhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!" + "'", str4.equals("hhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!hhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!ihHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!hhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!hhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!HhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!IhHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!hHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test593");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str6.equals("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test594");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("Hhi!hhi!ihi!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str1.equals("hHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test595");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str6.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str7.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str8.equals("HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test596");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhHIH!IhHIH!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str8.equals("hHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test597");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHIH!IHHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHIH!IHHIH!!" + "'", str1.equals("HHHIH!IHHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test598");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!Ihhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!Ihhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!!" + "'", str2.equals("hhhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!Ihhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test599");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhih!hhhih!Hhhih!Ihhih!Hhhih!!hhih!Ihhih!hhhih!Hhhih!Ihhih!Hhhih!!hhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str1.equals("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test600");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHhih!iHhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhHIH!IhHIHI!H!!" + "'", str1.equals("HhHIH!IhHIHI!H!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test601");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str8.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str9.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test602");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1.equals("HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test603");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhHIH!IhHIHI!H!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!ihhihi!h!!" + "'", str1.equals("Hhhih!ihhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test604");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test605");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str5.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str6.equals("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test606");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!" + "'", str1.equals("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test607");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!", 0, "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", true);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test608");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test609");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhhih!ihhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test610");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!" + "'", str2.equals("hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test611");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHi!iHi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!ihi!!" + "'", str1.equals("Hhi!ihi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test612");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HhI!IhI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhI!IhI!!" + "'", str1.equals("HhI!IhI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test613");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!", (int) (byte) 1, "hhhih!ihhih!!", true);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test614");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test615");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!" + "'", str2.equals("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test616");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test617");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHI!HHI!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str2.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test618");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHHIH!IHHIH!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHIH!IHHIH!!" + "'", str1.equals("hHHIH!IHHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test619");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("HHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHIH!IHHIH!!", charArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHHIH!IHHIH!!" + "'", str8.equals("HHHIH!IHHIH!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test620");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("H", charArray5);
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
            System.out.format("%n%s%n", "WordUtils1.test621");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (-1), "hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", true);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test622");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hI!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hI!" + "'", str2.equals("hI!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test623");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!" + "'", str2.equals("HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test624");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHi!iHi!!", (int) '#', "HHHIH!IHHIH!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHi!iHi!!" + "'", str4.equals("hHi!iHi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test625");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang3.text.WordUtils.capitalize("hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str8.equals("Hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str9.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test626");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hhi!hhi!ihi!hhi!!", charArray3);
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
            System.out.format("%n%s%n", "WordUtils1.test627");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHHIH!IHHIHI!H!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHIH!IHHIHI!H!!" + "'", str1.equals("hHHIH!IHHIHI!H!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test628");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhih!", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhih!" + "'", str2.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test629");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhih!ihhihi!h!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hhhih!ihhihi!h!!" + "'", str1.equals("hhhih!ihhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test630");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!" + "'", str2.equals("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test631");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test632");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("hHIH!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHIH!" + "'", str7.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str8.equals("HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test633");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str2.equals("hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test634");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test635");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhi!Hhi!Ihi!Hhi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!Hhi!Ihi!Hhi!!" + "'", str1.equals("Hhi!Hhi!Ihi!Hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test636");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!" + "'", str1.equals("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test637");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!Ihhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!iHHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!!" + "'", str1.equals("HHHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!iHHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test638");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!" + "'", str1.equals("Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!Hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!Ihhi!hhi!ihi!hhi!!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test639");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (int) (byte) 100, "HI!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str4.equals("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test640");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHhi!Hhi!Ihi!Hhi!!IHhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test641");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test642");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", charArray4);
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
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test643");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("Hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHI!HHI!IHHHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!I!HHI!!", charArray5);
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
            System.out.format("%n%s%n", "WordUtils1.test644");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhHIH!IhHIH!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!" + "'", str7.equals("hHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhHIH!IhHIH!!" + "'", str8.equals("hhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test645");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hHhih!iHhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HhHIH!IhHIH!!" + "'", str1.equals("HhHIH!IhHIH!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test646");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("HHI!hHI!iHI!hHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhih!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHI!hHI!iHI!hHI!!" + "'", str7.equals("HHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhih!" + "'", str8.equals("hhih!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test647");
        char[] charArray5 = new char[] { 'a', '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.initials("hHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h" + "'", str7.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test648");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalize("hHI!hHI!iHI!hHI!!", charArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str8.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test649");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!" + "'", str2.equals("Hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test650");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!" + "'", str1.equals("HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test651");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHIH!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHIH!", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hHIH!" + "'", str6.equals("hHIH!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str7.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHIH!" + "'", str8.equals("hHIH!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test652");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhHIH!IhHIH!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("h", charArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "h" + "'", str8.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test653");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str6.equals("HHI!HHI!IHI!HHI!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test654");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHI!hHI!iHI!hHI!!", charArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hHI!hHI!iHI!hHI!!" + "'", str8.equals("hHI!hHI!iHI!hHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test655");
        char[] charArray5 = new char[] { '4', '#' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhhih!ihhihi!h!!", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hhih!" + "'", str7.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hhhih!ihhihi!h!!" + "'", str8.equals("hhhih!ihhihi!h!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test656");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHhih!iHhih!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhih!iHhih!!" + "'", str1.equals("hHhih!iHhih!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test657");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test658");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!" + "'", str2.equals("HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test659");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", (-1), "hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!Hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!Ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!Hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!Hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!" + "'", str4.equals("hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!Hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!Ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!Hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!Hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!hhhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!ihhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!hhi!hhi!ihhhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!i!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test660");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHhih!iHhihi!h!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str7.equals("HHI!HHI!IHI!HHI!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HHhih!iHhihi!h!!" + "'", str8.equals("HHhih!iHhihi!h!!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test661");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.swapCase("hhhi!hhi!ihHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!Hi!hi!hhi!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!!IhHi!hi!hhHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hi!ihiHi!!hHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!HHHI!hHI!iHI!hHI!!IHHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!HHI!hHI!iHI!hHI!!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hI!HI!HHI!Hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!!iHhI!HI!HHhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!HI!IHIhI!!Hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!HHI!!!" + "'", str1.equals("HHHI!HHI!IHhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hI!HI!HHI!Hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!!iHhI!HI!HHhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!HI!IHIhI!!Hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test662");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("HHHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!iHHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!iHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!hHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!HHHI!HHI!IHI!HHI!!iHHI!HHI!IHI!HHI!!!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "H" + "'", str1.equals("H"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test663");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("", charArray4);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.uncapitalize("Hhih!", charArray4);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("h", charArray4);
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
            System.out.format("%n%s%n", "WordUtils1.test664");
        char[] charArray5 = new char[] { ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhi!Hhi!Ihi!Hhi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang3.text.WordUtils.initials("HHHI!HHI!IHhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hI!HI!HHI!Hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!!iHhI!HI!HHhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!HI!IHIhI!!Hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!Ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!hhhi!Hhi!Ihi!Hhi!!ihhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!hhi!Hhi!Ihi!Hhi!!!HHI!!!", charArray5);
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
            System.out.format("%n%s%n", "WordUtils1.test665");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!HHI!IHI!HI!HHI!!IHHI!HI!HHI!IHIHI!!HHI!!!I!HHI!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!" + "'", str1.equals("Hhi!hhi!ihhhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!i!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test666");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!" + "'", str2.equals("Hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test667");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!", (int) (short) 1, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hi!hhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!!ihhi!hi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!ihihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!" + "'", str4.equals("HHHI!hHI!iHI!hHI!!iHHI!hHI!iHI!hHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test668");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!" + "'", str1.equals("Hhhi!hhi!iHi!hi!hhi!!IhHi!hi!hhi!ihiHi!!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test669");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.initials("hhhi!hhi!ihi!hi!hhi!!ihhi!hi!hhi!ihihi!!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test670");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1.equals("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test671");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("HHhi!Hhi!Ihi!Hhi!!IHhi!Hhi!Ihi!Hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHhi!Hhi!Ihi!Hhi!!IHhi!Hhi!Ihi!Hhi!!!" + "'", str1.equals("hHhi!Hhi!Ihi!Hhi!!IHhi!Hhi!Ihi!Hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test672");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!" + "'", str2.equals("HHHI!HHI!IhI!HI!HHI!!iHhI!HI!HHI!IHIhI!!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test673");
        java.lang.String str4 = org.apache.commons.lang3.text.WordUtils.wrap("hhi!hhi!ihi!hhi!!", 10, "hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str4.equals("hhi!hhi!ihi!hhi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test674");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.uncapitalize("hHi!iHi!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hHi!iHi!!" + "'", str1.equals("hHi!iHi!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test675");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhiHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!!ihi!hhi!!IHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!Hhi!hhi!iHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!HHHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!hi!hhi!ihi!hhi!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!hhi!ihi!hhi!!!" + "'", str1.equals("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!ihhih!hhhih!hhhih!ihhih!hhhih!!hhih!!hi!hhi!ihi!hhi!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test676");
        java.lang.String str1 = org.apache.commons.lang3.text.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1.equals("HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!"));
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test677");
        char[] charArray4 = new char[] { ' ', '4' };
        java.lang.String str5 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("hhih!", charArray4);
        java.lang.String str6 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("HHIH!", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hhih!" + "'", str5.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hhih!" + "'", str6.equals("Hhih!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void WordUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WordUtils1.test678");
        java.lang.String str2 = org.apache.commons.lang3.text.WordUtils.wrap("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!" + "'", str2.equals("HHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!iHHIH!HHHIH!hHHIH!iHHIH!hHHIH!!HHIH!!"));
    }
}

