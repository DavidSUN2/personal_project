
package CharUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharUtils1 {

    public static boolean debug = false;

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test501");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test502");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test503");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test504");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test505");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test506");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test507");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test508");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test509");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test510");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test511");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test512");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test513");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test514");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test515");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test516");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test517");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test518");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test519");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test520");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test521");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test522");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test523");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test524");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test525");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test526");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test527");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test528");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test529");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test530");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test531");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test532");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test533");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test534");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test535");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test536");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test537");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test538");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test539");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test540");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test541");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test542");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test543");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test544");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test545");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test546");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test547");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test548");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test549");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test550");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test551");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test552");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test553");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test554");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test555");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test556");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test557");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test558");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test559");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test560");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test561");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test562");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test563");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test564");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test565");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test566");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test567");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test568");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test569");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test570");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test571");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test572");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test573");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test574");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test575");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test576");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test577");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test578");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test579");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test580");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test581");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test582");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test583");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test584");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test585");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test586");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test587");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test588");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test589");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test590");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test591");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test592");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test593");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test594");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test595");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test596");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test597");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test598");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test599");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test600");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test601");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test602");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test603");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test604");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test605");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test606");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test607");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test608");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test609");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test610");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test611");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test612");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test613");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test614");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test615");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test616");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test617");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test618");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test619");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test620");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test621");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test622");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test623");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test624");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test625");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test626");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test627");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test628");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test629");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test630");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test631");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test632");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test633");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test634");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test635");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test636");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test637");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test638");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test639");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test640");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test641");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test642");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test643");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test644");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test645");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test646");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test647");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test648");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test649");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test650");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test651");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test652");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" ", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test653");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test654");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test655");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test656");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test657");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test658");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test659");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test660");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test661");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test662");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test663");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test664");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000a", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test665");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test666");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test667");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test668");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test669");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test670");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test671");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test672");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test673");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test674");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test675");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test676");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test677");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test678");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test679");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test680");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test681");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test682");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test683");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test684");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test685");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test686");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test687");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test688");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test689");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test690");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test691");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test692");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test693");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test694");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test695");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test696");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test697");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test698");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test699");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test700");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test701");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test702");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test703");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test704");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test705");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test706");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test707");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test708");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test709");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test710");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test711");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test712");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test713");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test714");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test715");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test716");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test717");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test718");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test719");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test720");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test721");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("a", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test722");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test723");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test724");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test725");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test726");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test727");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test728");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test729");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test730");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test731");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test732");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test733");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test734");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test735");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test736");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test737");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test738");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test739");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test740");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test741");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test742");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test743");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test744");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test745");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0068", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test746");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test747");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test748");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test749");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test750");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034", '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test751");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test752");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test753");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test754");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test755");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test756");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test757");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test758");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test759");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test760");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test761");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test762");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test763");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test764");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test765");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test766");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u000d", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test767");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test768");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test769");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test770");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test771");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test772");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test773");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test774");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test775");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test776");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test777");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test778");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test779");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test780");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test781");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test782");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test783");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test784");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test785");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0061", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test786");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test787");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test788");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test789");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test790");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test791");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test792");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test793");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test794");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test795");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test796");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("4", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test797");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test798");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test799");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test800");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test801");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test802");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test803");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test804");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test805");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test806");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '\\');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test807");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test808");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test809");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test810");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test811");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test812");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test813");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test814");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test815");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test816");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test817");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test818");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test819");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test820");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test821");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test822");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test823");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test824");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test825");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test826");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test827");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test828");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test829");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test830");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test831");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test832");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test833");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test834");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test835");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test836");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test837");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\n", 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test838");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test839");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test840");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test841");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test842");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test843");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test844");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test845");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test846");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test847");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test848");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test849");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test850");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test851");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test852");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020", '\n');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test853");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test854");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test855");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test856");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test857");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test858");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test859");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test860");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test861");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test862");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test863");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test864");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test865");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test866");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void CharUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharUtils1.test867");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) 'h');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }
}

