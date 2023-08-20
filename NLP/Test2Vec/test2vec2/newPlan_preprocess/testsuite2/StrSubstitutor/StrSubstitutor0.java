package StrSubstitutor;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrSubstitutor0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test01");
        char char0 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_ESCAPE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '$' + "'", char0 == '$');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test02");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) ' ', (-1));
        java.lang.Object obj7 = null;
        java.lang.String str8 = strSubstitutor0.replace(obj7);
        char char9 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test03");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strSubstitutor0.replace((java.lang.CharSequence) "4 ", (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test04");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str9 = strSubstitutor0.replace(strBuilder6, 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test05");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) "4 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4 " + "'", str1.equals("4 "));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test06");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) "i", properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "i" + "'", str2.equals("i"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test07");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) ' ', (-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        java.lang.String str8 = strSubstitutor0.replace(strBuilder7);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup9 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test08");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) (byte) 0, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test09");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) (short) 100, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test10");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix("i");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("4 ");
        char char8 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '$' + "'", char8 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test11");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str9 = strSubstitutor0.replace(strBuilder6, (int) (short) 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test12");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        char char4 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(strBuilder5);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '$' + "'", char4 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test13");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer3, (int) 'a', (int) (byte) -1);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test14");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix("i");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("4 ");
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.String str9 = strSubstitutor0.replace(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test15");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix("i");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("4 ");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariablePrefix('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test16");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = null;
        java.lang.String str5 = strSubstitutor0.replace(strBuilder2, (int) (short) 100, (-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(strBuilder6, (int) (byte) 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test17");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix("i");
        char char6 = strSubstitutor0.getEscapeChar();
        java.lang.Class<?> wildcardClass7 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '$' + "'", char6 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test18");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strSubstitutor0.replace((java.lang.CharSequence) "", (int) (short) 10, (int) '$');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test19");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        strSubstitutor0.setEscapeChar('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strSubstitutor0.replace((java.lang.CharSequence) "100", (int) '$', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test20");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) false, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test21");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor5.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariableSuffixMatcher(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test22");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        char[] charArray6 = new char[] { '4', ' ' };
        java.lang.String str7 = strSubstitutor3.replace(charArray6);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor3.setVariableSuffixMatcher(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4 " + "'", str7.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test23");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = null;
        java.lang.String str5 = strSubstitutor0.replace(strBuilder2, (int) (short) 100, (-1));
        strSubstitutor0.setEscapeChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test24");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = null;
        java.lang.String str5 = strSubstitutor0.replace(strBuilder2, (int) (short) 100, (-1));
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix("a");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix("10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test25");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        strSubstitutor0.setEscapeChar('#');
        java.lang.StringBuilder stringBuilder6 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(stringBuilder6);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix("i");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test26");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup4 = strSubstitutor3.getVariableResolver();
        strSubstitutor3.setEscapeChar('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        java.lang.String str8 = strSubstitutor3.replace(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test27");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix("i");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("4 ");
        java.lang.StringBuffer stringBuffer8 = null;
        boolean boolean9 = strSubstitutor7.replaceIn(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test28");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str4 = strSubstitutor0.replace("hi!", (int) (byte) 1, (int) (byte) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefixMatcher(strMatcher5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Variable prefix matcher must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "i" + "'", str4.equals("i"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test29");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup4 = strSubstitutor3.getVariableResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = wildcardStrLookup4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup4);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test30");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = null;
        java.lang.String str3 = strSubstitutor0.replace(strBuilder2);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = null;
        java.lang.String str7 = strSubstitutor0.replace(strBuilder4, (-1), (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test31");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str4 = strSubstitutor0.replace("hi!", (int) (byte) 1, (int) (byte) 1);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "i" + "'", str4.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test32");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        java.lang.String str4 = strSubstitutor0.replace((java.lang.Object) 'a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor5.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffixMatcher(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "a" + "'", str4.equals("a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test33");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = null;
        java.lang.String str5 = strSubstitutor0.replace(strBuilder2, (int) (short) 100, (-1));
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix("a");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        java.lang.String str9 = strSubstitutor0.replace(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test34");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) ' ', (-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        java.lang.String str8 = strSubstitutor0.replace(strBuilder7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test35");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) 1L, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test36");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix('a');
        boolean boolean5 = strSubstitutor4.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test37");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup6 = strSubstitutor0.getVariableResolver();
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test38");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.StringBuffer stringBuffer4 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(stringBuffer4, (int) (byte) 1, (int) (short) 1);
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test39");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = null;
        java.lang.String str5 = strSubstitutor0.replace(strBuilder2, (int) (short) 100, (-1));
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix("a");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariableSuffix("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test40");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix("i");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor5.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test41");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        strSubstitutor0.setEscapeChar('#');
        java.lang.StringBuilder stringBuilder6 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(stringBuilder6);
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test42");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strSubstitutor0.replace("i", (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test43");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix('$');
        char char6 = strSubstitutor5.getEscapeChar();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        java.lang.String str8 = strSubstitutor5.replace(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '$' + "'", char6 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test44");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup4 = strSubstitutor3.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor3.setVariableSuffix("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor6.replaceIn(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test45");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) ' ', (-1));
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test46");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix("i");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("4 ");
        java.lang.String str9 = strSubstitutor7.replace((java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test47");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        boolean boolean4 = strSubstitutor0.isEnableSubstitutionInVariables();
        boolean boolean5 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test48");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup6 = strSubstitutor0.getVariableResolver();
        strSubstitutor0.setEscapeChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup6);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test49");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix('$');
        char char6 = strSubstitutor5.getEscapeChar();
        strSubstitutor5.setEscapeChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '$' + "'", char6 == '$');
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test50");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) "10.0", properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test51");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.lang.String str4 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test52");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix("i");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("4 ");
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor7.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test53");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup4 = strSubstitutor3.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor3.setVariableSuffix("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor3.getVariableSuffixMatcher();
        strSubstitutor3.setEnableSubstitutionInVariables(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test54");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str2 = strSubstitutor0.replace("0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test55");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix("i");
        char char6 = strSubstitutor0.getEscapeChar();
        java.lang.String str8 = strSubstitutor0.replace((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '$' + "'", char6 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test56");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        strSubstitutor3.setEnableSubstitutionInVariables(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test57");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        char char4 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(strBuilder5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix("0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '$' + "'", char4 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test58");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix('$');
        char char6 = strSubstitutor5.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor7.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor5.setVariableSuffixMatcher(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '$' + "'", char6 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test59");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        char[] charArray6 = new char[] { '4', ' ' };
        java.lang.String str7 = strSubstitutor3.replace(charArray6);
        char[] charArray8 = null;
        java.lang.String str9 = strSubstitutor3.replace(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4 " + "'", str7.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test60");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffixMatcher(strMatcher2);
        java.lang.StringBuffer stringBuffer4 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(stringBuffer4, (int) ' ', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test61");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffixMatcher(strMatcher2);
        java.lang.String str5 = strSubstitutor3.replace("");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        boolean boolean7 = strSubstitutor3.replaceIn(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test62");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test63");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffixMatcher(strMatcher2);
        java.lang.String str5 = strSubstitutor3.replace("");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        boolean boolean9 = strSubstitutor3.replaceIn(strBuilder6, (int) '#', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test64");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.Class<?> wildcardClass4 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test65");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        boolean boolean4 = strSubstitutor0.isEnableSubstitutionInVariables();
        boolean boolean5 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariableSuffix("4 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test66");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix('$');
        char char6 = strSubstitutor5.getEscapeChar();
        strSubstitutor5.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup9 = strSubstitutor5.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '$' + "'", char6 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup9);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test67");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffixMatcher(strMatcher2);
        java.lang.String str5 = strSubstitutor3.replace("");
        java.lang.StringBuilder stringBuilder6 = null;
        boolean boolean9 = strSubstitutor3.replaceIn(stringBuilder6, 10, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test68");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer3, (int) 'a', (int) (byte) -1);
        java.lang.String str8 = strSubstitutor0.replace((java.lang.CharSequence) "i");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test69");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = null;
        java.lang.String str5 = strSubstitutor0.replace(strBuilder2, (int) (short) 100, (-1));
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix("a");
        java.util.Properties properties8 = null;
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) "a", properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "a" + "'", str9.equals("a"));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test70");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup4 = strSubstitutor3.getVariableResolver();
        strSubstitutor3.setEscapeChar('a');
        java.util.Properties properties7 = null;
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor3, properties7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup4);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test71");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('$');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) ' ', (-1));
        java.lang.String str8 = strSubstitutor0.replace((java.lang.Object) 10.0d);
        char char9 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0" + "'", str8.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test72");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix("i");
        char char6 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '$' + "'", char6 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test73");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.String str5 = strSubstitutor0.replace((java.lang.Object) (byte) 0);
        char char6 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '$' + "'", char6 == '$');
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test74");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor3 = strSubstitutor0.setVariableSuffix("hi!");
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test75");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor5.setVariableSuffix('a');
        strSubstitutor7.setEnableSubstitutionInVariables(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test76");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(strBuilder6, (int) (short) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test77");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.String str5 = strSubstitutor0.replace((java.lang.Object) (byte) 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str7 = strSubstitutor0.replace(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }
}

