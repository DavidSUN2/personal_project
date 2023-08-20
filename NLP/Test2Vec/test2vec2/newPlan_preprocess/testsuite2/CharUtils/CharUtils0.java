package CharUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharUtils0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test001");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test002");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.CharUtils.toChar("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test003");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test004");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test005");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test006");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test007");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test008");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test009");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0023" + "'", str1.equals("\\u0023"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test010");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0023" + "'", str1.equals("\\u0023"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test011");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test012");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test013");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test014");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test015");
        char char0 = org.apache.commons.lang3.CharUtils.LF;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\n' + "'", char0 == '\n');
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test016");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test017");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test018");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test019");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test020");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test021");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test022");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test023");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test024");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1 == '\n');
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test025");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test026");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test027");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test028");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0061" + "'", str1.equals("\\u0061"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test029");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u005c" + "'", str1.equals("\\u005c"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test030");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test031");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test032");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n" + "'", str1.equals("\n"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test033");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test034");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test035");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test036");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1.equals(' '));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test037");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test038");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character h is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test039");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test040");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test041");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test042");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1.equals(' '));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test043");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test044");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1.equals('\n'));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test045");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1.equals('#'));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test046");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1 == '\n');
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test047");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test048");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u005c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test049");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1.equals('\n'));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test050");
        char char0 = org.apache.commons.lang3.CharUtils.CR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\r' + "'", char0 == '\r');
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test051");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test052");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test053");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a" + "'", str1.equals("a"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test054");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test055");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "h" + "'", str1.equals("h"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test056");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0034" + "'", str1.equals("\\u0034"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test057");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test058");
        org.apache.commons.lang3.CharUtils charUtils0 = new org.apache.commons.lang3.CharUtils();
        java.lang.Class<?> wildcardClass1 = charUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test059");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test060");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test061");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('h');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character h is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test062");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \\ is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test063");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test064");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test065");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test066");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test067");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#" + "'", str1.equals("#"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test068");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test069");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1.equals('a'));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test070");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1.equals('\r'));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test071");
        char char1 = org.apache.commons.lang3.CharUtils.toChar(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test072");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test073");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test074");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test075");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test076");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test077");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test078");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0061");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test079");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test080");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test081");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test082");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test083");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character \r is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test084");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test085");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test086");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1 == '\r');
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test087");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n" + "'", str1.equals("\n"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test088");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u0061");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test089");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test090");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test091");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test092");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test093");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test094");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character # is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test095");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0068" + "'", str1.equals("\\u0068"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test096");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0061" + "'", str1.equals("\\u0061"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test097");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u0020" + "'", str1.equals("\\u0020"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test098");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test099");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test100");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test101");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character   is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test102");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test103");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\u000d" + "'", str1.equals("\\u000d"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test104");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test105");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test106");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character a is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test107");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\" + "'", str1.equals("\\"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test108");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test109");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test110");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test111");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test112");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test113");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test114");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test115");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test116");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(char1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test117");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test118");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test119");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test120");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test121");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test122");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test123");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test124");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test125");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test126");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test127");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test128");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test129");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test130");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("\\u005c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1.equals('\\'));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test131");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test132");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1.equals('4'));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test133");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test134");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test135");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1.equals('a'));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test136");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test137");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils0.test138");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

