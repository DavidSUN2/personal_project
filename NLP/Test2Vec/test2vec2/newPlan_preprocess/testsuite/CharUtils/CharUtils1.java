package CharUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharUtils1 {

    public static boolean debug = false;

    @Test
    public void CharUtils501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils501");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils502");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils503");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils504");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils505");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils506");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils507");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils508");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils509");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils510");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils511");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils512");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils513");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils514");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils515");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils516");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils517");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils518");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils519");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils520");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils521");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils522");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils523");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils524");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils525");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils526");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils527");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils528");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils529");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils530");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils531");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils532");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils533");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils534");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils535");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils536");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils537");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils538");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils539");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils540");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils541");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils542");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils543");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils544");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils545");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils546");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils547");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils548");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils549");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils550");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils551");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils552");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils553");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils554");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils555");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils556");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils557");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils558");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils559");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils560");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils561");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils562");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils563");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils564");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils565");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils566");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils567");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils568");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils569");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils570");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils571");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils572");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils573");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils574");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils575");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils576");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils577");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils578");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils579");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils580");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils581");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils582");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils583");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils584");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils585");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils586");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils587");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils588");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils589");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils590");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils591");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils592");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils593");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils594");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils595");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils596");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils597");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils598");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils599");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils600");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils601");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils602");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils603");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils604");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils605");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils606");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils607");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils608");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils609");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils610");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils611");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils612");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils613");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils614");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils615");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils616");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils617");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils618");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils619");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils620");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils621");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils622");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils623");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils624");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils625");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils626");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils627");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils628");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils629");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils630");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils631");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils632");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils633");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils634");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils635");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils636");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils637");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils638");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils639");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils640");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils641");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils642");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils643");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils644");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils645");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils646");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils647");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils648");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils649");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils650");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils651");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils652");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils653");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils654");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils655");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils656");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils657");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils658");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils659");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils660");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils661");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils662");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils663");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils664");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils665");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils666");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils667");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils668");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils669");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils670");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils671");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils672");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils673");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils674");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils675");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils676");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils677");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils678");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils679");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils680");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils681");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils682");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils683");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils684");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils685");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils686");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils687");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils688");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils689");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils690");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils691");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils692");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils693");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils694");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils695");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils696");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils697");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils698");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils699");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils700");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils701");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils702");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils703");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils704");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils705");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils706");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils707");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils708");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils709");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils710");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils711");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils712");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils713");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils714");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils715");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils716");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils717");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils718");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils719");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils720");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils721");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils722");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils723");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils724");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils725");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils726");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils727");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils728");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils729");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils730");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils731");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils732");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils733");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils734");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils735");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils736");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils737");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils738");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils739");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils740");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils741");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils742");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils743");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils744");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils745");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils746");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils747");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils748");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils749");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils750");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils751");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils752");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils753");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils754");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils755");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils756");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils757");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils758");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils759");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils760");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils761");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils762");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils763");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils764");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils765");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils766");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils767");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils768");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils769");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils770");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils771");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils772");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils773");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils774");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils775");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils776");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils777");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils778");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils779");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils780");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils781");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils782");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils783");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils784");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils785");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils786");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils787");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils788");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils789");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils790");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils791");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils792");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils793");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils794");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils795");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils796");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils797");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils798");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils799");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils800");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils801");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils802");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils803");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils804");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils805");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils806");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils807");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils808");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils809");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils810");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils811");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils812");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils813");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils814");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils815");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils816");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils817");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils818");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils819");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils820");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils821");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils822");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils823");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils824");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils825");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils826");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils827");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils828");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils829");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils830");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils831");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils832");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils833");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils834");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils835");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils836");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils837");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils838");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils839");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils840");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils841");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils842");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils843");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils844");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils845");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils846");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils847");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils848");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils849");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils850");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils851");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils852");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils853");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils854");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils855");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils856");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils857");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils858");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils859");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils860");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils861");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils862");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils863");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils864");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils865");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils866");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.CharUtils867");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }
}

