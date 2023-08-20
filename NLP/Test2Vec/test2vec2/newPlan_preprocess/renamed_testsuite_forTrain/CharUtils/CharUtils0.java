
package CharUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharUtils0 {

    public static boolean debug = false;

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test001");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4" + "'", str1.equals("4"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test002");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0023" + "'", str1.equals("\\u0023"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test003");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test004");
        char char0 = org.apache.commons.lang3.CharUtils.CR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\r' + "'", char0 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test005");
        char char0 = org.apache.commons.lang3.CharUtils.LF;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\n' + "'", char0 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test006");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test007");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \n is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test008");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test009");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0061" + "'", str1.equals("\\u0061"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test010");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test011");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a" + "'", str1.equals("a"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test012");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test013");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0061" + "'", str1.equals("\\u0061"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test014");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character   is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test015");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character a is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test016");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test017");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\r" + "'", str1.equals("\r"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test018");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test019");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u000a" + "'", str1.equals("\\u000a"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test020");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test021");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test022");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test023");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test024");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test025");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test026");
        org.apache.commons.lang3.CharUtils charUtils0 = new org.apache.commons.lang3.CharUtils();
        java.lang.Class<?> wildcardClass1 = charUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test027");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1.equals('#'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test028");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test029");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test030");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test031");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1.equals(' '));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test032");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test033");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test034");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test035");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test036");
        char char1 = org.apache.commons.lang3.CharUtils.toChar(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test037");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0061");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test038");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test039");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0020" + "'", str1.equals("\\u0020"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test040");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test041");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test042");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a" + "'", str1.equals("a"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test043");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test044");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test045");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test046");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test047");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character a is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test048");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0034" + "'", str1.equals("\\u0034"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test049");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test050");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0020");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test051");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test052");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test053");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test054");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#" + "'", str1.equals("#"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test055");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test056");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1.equals('4'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test057");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test058");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test059");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test060");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test061");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test062");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test063");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test064");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u005c" + "'", str1.equals("\\u005c"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test065");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \n is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test066");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \r is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test067");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test068");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test069");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u000d" + "'", str1.equals("\\u000d"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test070");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1.equals('\r'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test071");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u005c" + "'", str1.equals("\\u005c"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test072");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test073");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#" + "'", str1.equals("#"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test074");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test075");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test076");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test077");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \\ is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test078");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n" + "'", str1.equals("\n"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test079");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test080");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test081");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test082");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test083");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test084");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test085");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test086");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test087");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test088");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test089");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test090");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character # is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test091");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test092");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0061");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test093");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test094");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \\ is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test095");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u000d" + "'", str1.equals("\\u000d"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test096");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test097");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \r is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test098");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1.equals('#'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test099");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test100");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test101");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test102");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1.equals('4'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test103");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test104");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test105");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0034" + "'", str1.equals("\\u0034"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test106");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test107");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1.equals('\n'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test108");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test109");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test110");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test111");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test112");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0020" + "'", str1.equals("\\u0020"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test113");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character # is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test114");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test115");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1.equals('\r'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test116");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test117");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4" + "'", str1.equals("4"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test118");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test119");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test120");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test121");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u000d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test122");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test123");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test124");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test125");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test126");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\" + "'", str1.equals("\\"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test127");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test128");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test129");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test130");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test131");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test132");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test133");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test134");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test135");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test136");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u000a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test137");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0023");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test138");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0068" + "'", str1.equals("\\u0068"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test139");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test140");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test141");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test142");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test143");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test144");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u000d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test145");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test146");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test147");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test148");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test149");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u005c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test150");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test151");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test152");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u000a" + "'", str1.equals("\\u000a"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test153");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test154");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test155");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test156");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test157");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test158");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test159");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test160");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test161");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test162");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test163");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1.equals(' '));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test164");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test165");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character   is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test166");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test167");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test168");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u000a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test169");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u005c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test170");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test171");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.CharUtils.toChar("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test172");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test173");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n" + "'", str1.equals("\n"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test174");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1.equals('a'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test175");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test176");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0023" + "'", str1.equals("\\u0023"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test177");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test178");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test179");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test180");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test181");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('h');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character h is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test182");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test183");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test184");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(char1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test185");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test186");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test187");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test188");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test189");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0068" + "'", str1.equals("\\u0068"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test190");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test191");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test192");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test193");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test194");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test195");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test196");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test197");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\r" + "'", str1.equals("\r"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test198");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test199");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test200");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test201");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0034");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test202");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test203");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test204");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test205");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test206");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test207");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test208");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test209");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test210");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test211");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test212");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test213");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test214");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test215");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test216");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test217");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test218");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test219");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test220");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test221");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test222");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test223");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test224");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test225");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test226");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test227");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test228");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test229");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test230");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test231");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test232");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\" + "'", str1.equals("\\"));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test233");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test234");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test235");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test236");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test237");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test238");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test239");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test240");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test241");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0034");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test242");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test243");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test244");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test245");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test246");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test247");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test248");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test249");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test250");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test251");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test252");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test253");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1.equals('h'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test254");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test255");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test256");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test257");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test258");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test259");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test260");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1.equals('a'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test261");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character h is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test262");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test263");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test264");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test265");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test266");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test267");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test268");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test269");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test270");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test271");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0068");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test272");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test273");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test274");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test275");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test276");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test277");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test278");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test279");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test280");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test281");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test282");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test283");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test284");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test285");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0020");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test286");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test287");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test288");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test289");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0068");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test290");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test291");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0023");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test292");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test293");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test294");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test295");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1.equals('\n'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test296");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test297");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test298");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test299");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test300");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test301");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test302");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test303");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test304");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test305");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test306");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test307");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test308");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test309");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test310");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test311");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test312");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test313");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test314");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test315");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test316");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test317");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test318");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test319");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test320");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test321");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test322");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test323");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test324");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test325");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1.equals('h'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test326");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test327");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test328");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test329");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test330");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test331");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test332");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test333");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test334");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test335");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test336");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test337");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test338");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test339");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test340");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test341");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test342");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test343");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test344");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test345");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1.equals('h'));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test346");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test347");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test348");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test349");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test350");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test351");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test352");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test353");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test354");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test355");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test356");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test357");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test358");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test359");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test360");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test361");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test362");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test363");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test364");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test365");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test366");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test367");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test368");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test369");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test370");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test371");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test372");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test373");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test374");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test375");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test376");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test377");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test378");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test379");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test380");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test381");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test382");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test383");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test384");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test385");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test386");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test387");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test388");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test389");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test390");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test391");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test392");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test393");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test394");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test395");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test396");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test397");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test398");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test399");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test400");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test401");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test402");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test403");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test404");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test405");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test406");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test407");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test408");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test409");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test410");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test411");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test412");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test413");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test414");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test415");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test416");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test417");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test418");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test419");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test420");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test421");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test422");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test423");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test424");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test425");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test426");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test427");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test428");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test429");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test430");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test431");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test432");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test433");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test434");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test435");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test436");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test437");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test438");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test439");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test440");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test441");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test442");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test443");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test444");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test445");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test446");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test447");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test448");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test449");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test450");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test451");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test452");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test453");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test454");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test455");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test456");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test457");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test458");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test459");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test460");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test461");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test462");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test463");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test464");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test465");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test466");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test467");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test468");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test469");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test470");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test471");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test472");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test473");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test474");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test475");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test476");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test477");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test478");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test479");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test480");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test481");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test482");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test483");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test484");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test485");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test486");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test487");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test488");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test489");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test490");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test491");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test492");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test493");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test494");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test495");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test496");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test497");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test498");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test499");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test500");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }
}

