package CharUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharUtils0 {

    public static boolean debug = false;

    @Test
    public void CharUtils001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils001");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4" + "'", str1.equals("4"));
    }

    @Test
    public void CharUtils002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils002");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0023" + "'", str1.equals("\\u0023"));
    }

    @Test
    public void CharUtils003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils003");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils004");
        char char0 = org.apache.commons.lang3.CharUtils.CR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\r' + "'", char0 == '\r');
    }

    @Test
    public void CharUtils005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils005");
        char char0 = org.apache.commons.lang3.CharUtils.LF;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\n' + "'", char0 == '\n');
    }

    @Test
    public void CharUtils006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils006");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils007");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \n is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils008");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils009");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0061" + "'", str1.equals("\\u0061"));
    }

    @Test
    public void CharUtils010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils010");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils011");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a" + "'", str1.equals("a"));
    }

    @Test
    public void CharUtils012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils012");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils013");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0061" + "'", str1.equals("\\u0061"));
    }

    @Test
    public void CharUtils014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils014");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character   is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils015");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character a is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils016");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils017");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\r" + "'", str1.equals("\r"));
    }

    @Test
    public void CharUtils018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils018");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils019");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u000a" + "'", str1.equals("\\u000a"));
    }

    @Test
    public void CharUtils020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils020");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils021");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void CharUtils022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils022");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils023");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils024");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils025");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils026");
        org.apache.commons.lang3.CharUtils charUtils0 = new org.apache.commons.lang3.CharUtils();
        java.lang.Class<?> wildcardClass1 = charUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharUtils027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils027");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1.equals('#'));
    }

    @Test
    public void CharUtils028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils028");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils029");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils030");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils031");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1.equals(' '));
    }

    @Test
    public void CharUtils032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils032");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils033");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils034");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils035");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils036");
        char char1 = org.apache.commons.lang3.CharUtils.toChar(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void CharUtils037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils037");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0061");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils038");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils039");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0020" + "'", str1.equals("\\u0020"));
    }

    @Test
    public void CharUtils040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils040");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils041");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils042");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a" + "'", str1.equals("a"));
    }

    @Test
    public void CharUtils043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils043");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void CharUtils044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils044");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils045");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils046");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils047");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character a is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils048");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0034" + "'", str1.equals("\\u0034"));
    }

    @Test
    public void CharUtils049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils049");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void CharUtils050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils050");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0020");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils051");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils052");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharUtils053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils053");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils054");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#" + "'", str1.equals("#"));
    }

    @Test
    public void CharUtils055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils055");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils056");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1.equals('4'));
    }

    @Test
    public void CharUtils057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils057");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils058");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils059");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils060");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils061");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils062");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils063");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils064");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u005c" + "'", str1.equals("\\u005c"));
    }

    @Test
    public void CharUtils065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils065");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \n is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils066");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \r is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils067");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils068");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils069");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u000d" + "'", str1.equals("\\u000d"));
    }

    @Test
    public void CharUtils070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils070");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1.equals('\r'));
    }

    @Test
    public void CharUtils071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils071");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u005c" + "'", str1.equals("\\u005c"));
    }

    @Test
    public void CharUtils072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils072");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void CharUtils073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils073");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#" + "'", str1.equals("#"));
    }

    @Test
    public void CharUtils074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils074");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils075");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils076");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils077");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \\ is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils078");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n" + "'", str1.equals("\n"));
    }

    @Test
    public void CharUtils079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils079");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils080");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils081");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils082");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils083");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils084");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1 == '\r');
    }

    @Test
    public void CharUtils085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils085");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void CharUtils086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils086");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void CharUtils087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils087");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils088");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils089");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void CharUtils090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils090");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character # is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils091");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils092");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0061");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils093");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils094");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \\ is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils095");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u000d" + "'", str1.equals("\\u000d"));
    }

    @Test
    public void CharUtils096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils096");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils097");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \r is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils098");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1.equals('#'));
    }

    @Test
    public void CharUtils099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils099");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils100");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils101");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils102");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1.equals('4'));
    }

    @Test
    public void CharUtils103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils103");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils104");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils105");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0034" + "'", str1.equals("\\u0034"));
    }

    @Test
    public void CharUtils106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils106");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils107");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1.equals('\n'));
    }

    @Test
    public void CharUtils108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils108");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1 == '\r');
    }

    @Test
    public void CharUtils109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils109");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils110");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils111");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils112");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0020" + "'", str1.equals("\\u0020"));
    }

    @Test
    public void CharUtils113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils113");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character # is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils114");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils115");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1.equals('\r'));
    }

    @Test
    public void CharUtils116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils116");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils117");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4" + "'", str1.equals("4"));
    }

    @Test
    public void CharUtils118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils118");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils119");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils120");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils121");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u000d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils122");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils123");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils124");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils125");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void CharUtils126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils126");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\" + "'", str1.equals("\\"));
    }

    @Test
    public void CharUtils127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils127");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils128");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils129");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils130");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils131");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils132");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils133");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils134");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void CharUtils135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils135");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils136");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u000a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils137");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0023");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils138");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0068" + "'", str1.equals("\\u0068"));
    }

    @Test
    public void CharUtils139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils139");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils140");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils141");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils142");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils143");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils144");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u000d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils145");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils146");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils147");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils148");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils149");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u005c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils150");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils151");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void CharUtils152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils152");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u000a" + "'", str1.equals("\\u000a"));
    }

    @Test
    public void CharUtils153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils153");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void CharUtils154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils154");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils155");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils156");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils157");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils158");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils159");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils160");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils161");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils162");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils163");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1.equals(' '));
    }

    @Test
    public void CharUtils164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils164");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils165");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character   is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils166");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils167");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils168");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u000a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils169");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u005c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils170");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils171");
        // The following exception was thrown during execution in CharUtils generation
        try {
            char char1 = org.apache.commons.lang3.CharUtils.toChar("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils172");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils173");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n" + "'", str1.equals("\n"));
    }

    @Test
    public void CharUtils174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils174");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1.equals('a'));
    }

    @Test
    public void CharUtils175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils175");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils176");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0023" + "'", str1.equals("\\u0023"));
    }

    @Test
    public void CharUtils177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils177");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils178");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void CharUtils179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils179");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1 == '\n');
    }

    @Test
    public void CharUtils180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils180");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils181");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('h');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character h is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils182");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils183");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils184");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(char1);
    }

    @Test
    public void CharUtils185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils185");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils186");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils187");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils188");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils189");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0068" + "'", str1.equals("\\u0068"));
    }

    @Test
    public void CharUtils190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils190");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils191");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils192");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils193");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils194");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils195");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils196");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils197");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\r" + "'", str1.equals("\r"));
    }

    @Test
    public void CharUtils198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils198");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils199");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void CharUtils200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils200");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils201");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0034");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils202");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils203");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils204");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils205");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils206");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils207");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils208");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils209");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils210");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils211");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils212");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils213");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils214");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils215");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils216");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils217");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils218");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils219");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils220");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils221");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils222");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1 == '\n');
    }

    @Test
    public void CharUtils223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils223");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils224");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils225");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils226");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils227");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils228");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void CharUtils229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils229");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils230");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void CharUtils231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils231");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils232");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\" + "'", str1.equals("\\"));
    }

    @Test
    public void CharUtils233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils233");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils234");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils235");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils236");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils237");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils238");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils239");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils240");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils241");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0034");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils242");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils243");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils244");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils245");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils246");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils247");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils248");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils249");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils250");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils251");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils252");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils253");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1.equals('h'));
    }

    @Test
    public void CharUtils254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils254");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils255");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils256");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils257");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils258");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils259");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils260");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1.equals('a'));
    }

    @Test
    public void CharUtils261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils261");
        // The following exception was thrown during execution in CharUtils generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character h is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils262");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils263");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils264");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils265");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils266");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils267");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils268");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils269");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils270");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils271");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0068");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils272");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils273");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils274");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils275");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils276");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils277");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils278");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils279");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils280");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils281");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils282");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils283");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils284");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils285");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0020");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils286");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils287");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils288");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils289");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0068");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils290");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils291");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0023");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils292");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils293");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils294");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils295");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1.equals('\n'));
    }

    @Test
    public void CharUtils296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils296");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils297");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils298");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils299");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils300");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils301");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils302");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils303");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils304");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils305");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils306");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils307");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void CharUtils308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils308");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils309");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils310");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils311");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils312");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils313");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils314");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils315");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils316");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils317");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils318");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils319");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils320");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils321");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils322");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils323");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils324");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils325");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1.equals('h'));
    }

    @Test
    public void CharUtils326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils326");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils327");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils328");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils329");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils330");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils331");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils332");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils333");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils334");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils335");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils336");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils337");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils338");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils339");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils340");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils341");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils342");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils343");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils344");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils345");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1.equals('h'));
    }

    @Test
    public void CharUtils346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils346");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils347");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils348");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils349");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils350");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils351");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils352");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils353");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils354");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils355");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils356");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils357");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils358");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils359");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils360");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils361");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils362");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils363");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils364");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils365");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils366");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils367");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils368");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils369");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils370");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils371");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils372");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils373");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils374");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils375");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils376");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils377");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils378");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils379");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils380");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils381");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils382");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils383");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils384");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils385");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils386");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils387");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils388");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils389");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils390");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils391");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils392");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils393");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils394");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils395");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils396");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils397");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils398");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils399");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils400");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils401");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils402");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils403");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils404");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils405");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils406");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils407");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils408");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils409");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils410");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils411");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils412");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils413");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils414");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils415");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils416");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils417");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils418");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils419");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils420");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils421");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils422");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils423");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils424");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils425");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils426");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils427");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils428");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils429");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils430");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils431");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils432");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils433");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils434");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils435");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils436");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils437");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils438");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils439");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils440");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils441");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils442");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils443");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils444");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils445");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils446");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils447");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils448");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils449");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils450");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils451");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils452");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils453");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils454");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils455");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils456");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils457");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils458");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils459");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils460");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils461");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils462");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils463");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils464");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils465");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils466");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils467");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils468");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils469");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils470");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils471");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils472");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils473");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils474");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils475");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils476");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils477");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils478");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils479");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils480");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils481");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils482");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils483");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils484");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils485");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils486");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils487");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils488");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils489");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils490");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils491");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils492");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils493");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils494");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils495");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils496");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils497");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils498");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils499");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.CharUtils500");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }
}

