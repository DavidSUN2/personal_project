package StrSubstitutor;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrSubstitutor0 {

    public static boolean debug = false;

    @Test
    public void StrSubstitutor001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor001");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffixMatcher(strMatcher1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Variable suffix matcher must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrSubstitutor002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor002");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str4 = strSubstitutor0.replace((java.lang.CharSequence) "hi!", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrSubstitutor003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor003");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str9 = strSubstitutor0.replace(strBuilder6, (int) 'a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor004");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) (-1L), properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1" + "'", str2.equals("-1"));
    }

    @Test
    public void StrSubstitutor005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor005");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str8 = strSubstitutor4.replace((java.lang.CharSequence) "", (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
    }

    @Test
    public void StrSubstitutor006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor006");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str9 = strSubstitutor0.replace(strBuilder6, (int) (short) 10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor007");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor4.setVariablePrefix('#');
        char char9 = strSubstitutor8.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void StrSubstitutor008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor008");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "a" + "'", str5.equals("a"));
    }

    @Test
    public void StrSubstitutor009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor009");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void StrSubstitutor010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor010");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) 10.0d, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void StrSubstitutor011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor011");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup6 = strSubstitutor0.getVariableResolver();
        java.lang.String str8 = strSubstitutor0.replace((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void StrSubstitutor012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor012");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        char[] charArray8 = new char[] { ' ' };
        java.lang.String str9 = strSubstitutor4.replace(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " " + "'", str9.equals(" "));
    }

    @Test
    public void StrSubstitutor013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor013");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str7 = strSubstitutor0.replace((java.lang.CharSequence) "10.0", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrSubstitutor014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor014");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor1.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor1.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefixMatcher(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        java.lang.String str9 = strSubstitutor0.replace(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor015");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor1.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor1.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefixMatcher(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor016");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        boolean boolean6 = strSubstitutor0.isEnableSubstitutionInVariables();
        boolean boolean7 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup8);
    }

    @Test
    public void StrSubstitutor017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor017");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StrSubstitutor018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor018");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void StrSubstitutor019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor019");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup6 = strSubstitutor0.getVariableResolver();
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) wildcardStrLookup6, properties7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup6);
    }

    @Test
    public void StrSubstitutor020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor020");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor1.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor1.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefixMatcher(strMatcher6);
        strSubstitutor7.setEnableSubstitutionInVariables(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
    }

    @Test
    public void StrSubstitutor021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor021");
        char char0 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_ESCAPE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '$' + "'", char0 == '$');
    }

    @Test
    public void StrSubstitutor022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor022");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor1.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor1.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefixMatcher(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        java.lang.String str9 = strSubstitutor7.replace(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor023");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup6 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffixMatcher(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor024");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        strSubstitutor6.setEnableSubstitutionInVariables(true);
        char char9 = strSubstitutor6.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
    }

    @Test
    public void StrSubstitutor025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor025");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        boolean boolean6 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix("");
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup9 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup9);
    }

    @Test
    public void StrSubstitutor026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor026");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor4.replace(stringBuffer7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor4.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor027");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        strSubstitutor0.setEscapeChar('a');
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
    }

    @Test
    public void StrSubstitutor028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor028");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer5, (int) (byte) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor029");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor4.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor030");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor6.setVariableSuffix(" ");
        boolean boolean9 = strSubstitutor8.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor031");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        boolean boolean7 = strSubstitutor4.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor4.setVariablePrefix("10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor032");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        strSubstitutor6.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor6.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor033");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix('#');
        java.lang.StringBuilder stringBuilder8 = null;
        boolean boolean9 = strSubstitutor7.replaceIn(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor034");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('a');
        java.lang.String str9 = strSubstitutor0.replace((java.lang.CharSequence) "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "a" + "'", str9.equals("a"));
    }

    @Test
    public void StrSubstitutor035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor035");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        strSubstitutor4.setEscapeChar(' ');
        char char9 = strSubstitutor4.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ' ' + "'", char9 == ' ');
    }

    @Test
    public void StrSubstitutor036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor036");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        boolean boolean6 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(" ");
        char char9 = strSubstitutor8.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void StrSubstitutor037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor037");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        strSubstitutor0.setEscapeChar('a');
        char char8 = strSubstitutor0.getEscapeChar();
        boolean boolean9 = strSubstitutor0.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor038");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor1.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor1.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefixMatcher(strMatcher6);
        java.lang.StringBuilder stringBuilder8 = null;
        boolean boolean9 = strSubstitutor7.replaceIn(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor039");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariablePrefix(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor040");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor4.getVariablePrefixMatcher();
        java.lang.String str9 = strSubstitutor4.replace((java.lang.Object) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void StrSubstitutor041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor041");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        boolean boolean6 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(" ");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor042");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor1.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor1.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefixMatcher(strMatcher6);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor7.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup8);
    }

    @Test
    public void StrSubstitutor043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor043");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor044");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) (short) 1, 0);
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor045");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        char[] charArray4 = new char[] { 'a' };
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str7 = strSubstitutor2.replace(charArray4, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void StrSubstitutor046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor046");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor047");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix('#');
        java.util.Properties properties8 = null;
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) '#', properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#" + "'", str9.equals("#"));
    }

    @Test
    public void StrSubstitutor048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor048");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void StrSubstitutor049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor049");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        strSubstitutor0.setEscapeChar('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix("0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor050");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void StrSubstitutor051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor051");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor0.getVariablePrefixMatcher();
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrSubstitutor052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor052");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        boolean boolean7 = strSubstitutor4.isEnableSubstitutionInVariables();
        java.util.Properties properties8 = null;
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) boolean7, properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void StrSubstitutor053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor053");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrSubstitutor054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor054");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor6.setVariableSuffix(" ");
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup9 = strSubstitutor8.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup9);
    }

    @Test
    public void StrSubstitutor055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor055");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('#');
        java.lang.String str8 = strSubstitutor6.replace("0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void StrSubstitutor056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor056");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('a');
        java.lang.String str9 = strSubstitutor0.replace((java.lang.Object) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "a" + "'", str9.equals("a"));
    }

    @Test
    public void StrSubstitutor057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor057");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor058");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor4.setVariablePrefix('#');
        java.lang.Class<?> wildcardClass9 = strSubstitutor8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrSubstitutor059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor059");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor060");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix('4');
        java.lang.StringBuffer stringBuffer8 = null;
        boolean boolean9 = strSubstitutor7.replaceIn(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor061");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor4.replace(stringBuffer7);
        char char9 = strSubstitutor4.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void StrSubstitutor062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor062");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder5, (int) (short) -1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor063");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('#');
        char char8 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '#' + "'", char8 == '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor064");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariablePrefix('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor065");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor066");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.String str9 = strSubstitutor0.replace(stringBuffer6, (int) (short) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor067");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        java.util.Properties properties6 = null;
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor068");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('a');
        java.lang.String str9 = strSubstitutor0.replace((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StrSubstitutor069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor069");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.lang.Class<?> wildcardClass4 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StrSubstitutor070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor070");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor5.setVariableSuffix(' ');
        java.lang.String str8 = strSubstitutor2.replace((java.lang.Object) strSubstitutor7);
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
    }

    @Test
    public void StrSubstitutor071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor071");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor6.replaceIn(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor072");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer5);
        java.lang.String str8 = strSubstitutor0.replace((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void StrSubstitutor073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor073");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        java.lang.String str8 = strSubstitutor0.replace("");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor074");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        strSubstitutor4.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor4.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor075");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = null;
        java.lang.String str6 = strSubstitutor0.replace(strBuilder3, (int) (byte) -1, (int) 'a');
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor076");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str6 = strSubstitutor0.replace("", 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StrSubstitutor077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor077");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = null;
        java.lang.String str6 = strSubstitutor0.replace(strBuilder3, (int) (byte) -1, (int) 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor0.getVariableSuffixMatcher();
        java.util.Properties properties8 = null;
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strMatcher7, properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrSubstitutor078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor078");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix('#');
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
    }

    @Test
    public void StrSubstitutor079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor079");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str8 = strSubstitutor2.replace(stringBuffer5, 0, (int) (short) 10);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup9 = strSubstitutor2.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup9);
    }

    @Test
    public void StrSubstitutor080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor080");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer5);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer7);
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor081");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.Class<?> wildcardClass9 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrSubstitutor082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor082");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) (short) 1, 0);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor083");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor084");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix('4');
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.String str9 = strSubstitutor7.replace(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor085");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix(" ");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariablePrefixMatcher(strMatcher7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor086");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariablePrefix(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor087");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        java.util.Properties properties7 = null;
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) '$', properties7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "$" + "'", str8.equals("$"));
    }

    @Test
    public void StrSubstitutor088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor088");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor6.replaceIn(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor089");
        java.lang.Object obj0 = null;
        java.util.Properties properties1 = null;
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace(obj0, properties1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrSubstitutor090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor090");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup6 = strSubstitutor0.getVariableResolver();
        java.lang.String str8 = strSubstitutor0.replace("-1");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor091");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str9 = strSubstitutor2.replace(strBuilder6, (int) (byte) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor092");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + " " + "'", str5.equals(" "));
    }

    @Test
    public void StrSubstitutor093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor093");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void StrSubstitutor094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor094");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) (short) 1, 0);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor095");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor096");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        boolean boolean6 = strSubstitutor0.isEnableSubstitutionInVariables();
        boolean boolean7 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor097");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix(" ");
        java.lang.String str6 = strSubstitutor4.replace((java.lang.CharSequence) "0");
        strSubstitutor4.setEscapeChar('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void StrSubstitutor098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor098");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("0");
        strSubstitutor0.setEscapeChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor099");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix(" ");
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str8 = strSubstitutor0.replace((java.lang.CharSequence) "#", (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
    }

    @Test
    public void StrSubstitutor100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor100");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        java.lang.String str7 = strSubstitutor2.replace((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
    }

    @Test
    public void StrSubstitutor101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor101");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor0.replace(stringBuffer3);
        java.lang.Class<?> wildcardClass5 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StrSubstitutor102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor102");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        boolean boolean6 = strSubstitutor0.isEnableSubstitutionInVariables();
        boolean boolean7 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor103");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariablePrefixMatcher();
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.String str9 = strSubstitutor0.replace(stringBuffer6, (int) (byte) -1, (int) '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor104");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor0.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffixMatcher(strMatcher5);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor6.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor105");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup9 = strSubstitutor8.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup9);
    }

    @Test
    public void StrSubstitutor106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor106");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        boolean boolean6 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(" ");
        char char9 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void StrSubstitutor107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor107");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor6.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor6.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor108");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        boolean boolean7 = strSubstitutor4.isEnableSubstitutionInVariables();
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void StrSubstitutor109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor109");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix(" ");
        java.lang.String str6 = strSubstitutor4.replace("-1");
        char char7 = strSubstitutor4.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
    }

    @Test
    public void StrSubstitutor110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor110");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix("");
        strSubstitutor6.setEscapeChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor111");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor4.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor4.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor112");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str6 = strSubstitutor0.replace("a", (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StrSubstitutor113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor113");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
    }

    @Test
    public void StrSubstitutor114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor114");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        java.lang.String str6 = strSubstitutor4.replace("0");
        java.lang.String str8 = strSubstitutor4.replace((java.lang.CharSequence) "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "a" + "'", str8.equals("a"));
    }

    @Test
    public void StrSubstitutor115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor115");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("1.0");
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str8 = strSubstitutor4.replace("", (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
    }

    @Test
    public void StrSubstitutor116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor116");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        java.lang.StringBuilder stringBuilder6 = null;
        boolean boolean9 = strSubstitutor2.replaceIn(stringBuilder6, 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor117");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor2.setVariablePrefix('4');
        java.lang.StringBuilder stringBuilder8 = null;
        boolean boolean9 = strSubstitutor2.replaceIn(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor118");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer3, (int) (byte) 0, 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariablePrefixMatcher(strMatcher7);
        boolean boolean9 = strSubstitutor0.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor119");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        java.lang.String str6 = strSubstitutor4.replace("0");
        char char7 = strSubstitutor4.getEscapeChar();
        java.lang.String str9 = strSubstitutor4.replace("10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '$' + "'", char7 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0" + "'", str9.equals("10.0"));
    }

    @Test
    public void StrSubstitutor120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor120");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer3, (int) (byte) 0, 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariablePrefixMatcher(strMatcher7);
        boolean boolean9 = strSubstitutor8.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor121");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor2.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrSubstitutor122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor122");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor6.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor8.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor123");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor4.getVariableResolver();
        java.lang.String str7 = strSubstitutor4.replace("-1");
        boolean boolean8 = strSubstitutor4.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1" + "'", str7.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor124");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str2 = strSubstitutor0.replace("10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void StrSubstitutor125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor125");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        java.lang.StringBuilder stringBuilder5 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(stringBuilder5, (int) (byte) -1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor126");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("-1");
        strSubstitutor6.setEnableSubstitutionInVariables(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor127");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        java.lang.Class<?> wildcardClass7 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StrSubstitutor128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor128");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        char[] charArray5 = null;
        java.lang.String str6 = strSubstitutor2.replace(charArray5);
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void StrSubstitutor129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor129");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor0.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor130");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        boolean boolean6 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix("");
        char char9 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void StrSubstitutor131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor131");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.String str3 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + " " + "'", str3.equals(" "));
    }

    @Test
    public void StrSubstitutor132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor132");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariableSuffixMatcher(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor133");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) (byte) -1, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1" + "'", str2.equals("-1"));
    }

    @Test
    public void StrSubstitutor134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor134");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor135");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor2.setVariablePrefix("1.0");
        java.lang.String str9 = strSubstitutor2.replace((java.lang.CharSequence) "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0" + "'", str9.equals("1.0"));
    }

    @Test
    public void StrSubstitutor136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor136");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor0.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffixMatcher(strMatcher5);
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor137");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor2.setVariableSuffix('$');
        java.lang.String str8 = strSubstitutor2.replace((java.lang.CharSequence) "10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0" + "'", str8.equals("10.0"));
    }

    @Test
    public void StrSubstitutor138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor138");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.String str9 = strSubstitutor0.replace(stringBuffer6, (int) (short) 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor139");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strMatcher6);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor2.setVariableSuffixMatcher(strMatcher6);
        java.lang.Class<?> wildcardClass9 = strMatcher6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrSubstitutor140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor140");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        java.util.Properties properties6 = null;
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor141");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        boolean boolean7 = strSubstitutor6.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor6.getVariableSuffixMatcher();
        boolean boolean9 = strSubstitutor6.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor142");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix(" ");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        java.lang.String str8 = strSubstitutor0.replace(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor143");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str8 = strSubstitutor2.replace(stringBuffer5, (int) '4', (int) (byte) 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor2.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor144");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer5);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        java.lang.String str8 = strSubstitutor0.replace(strBuilder7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor145");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        java.lang.String str6 = strSubstitutor4.replace("0");
        char char7 = strSubstitutor4.getEscapeChar();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        boolean boolean9 = strSubstitutor4.replaceIn(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '$' + "'", char7 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor146");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor2.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor6.getVariablePrefixMatcher();
        strSubstitutor6.setEnableSubstitutionInVariables(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrSubstitutor147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor147");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor4.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor4.getVariableResolver();
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.Class<?> wildcardClass9 = wildcardStrLookup8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup8);
    }

    @Test
    public void StrSubstitutor148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor148");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        java.lang.String str6 = strSubstitutor4.replace("0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor4.setVariableSuffix("0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor149");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        java.lang.String str3 = strSubstitutor0.replace((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void StrSubstitutor150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor150");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('#');
        boolean boolean8 = strSubstitutor0.isEnableSubstitutionInVariables();
        char char9 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '#' + "'", char9 == '#');
    }

    @Test
    public void StrSubstitutor151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor151");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor1.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor1.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefixMatcher(strMatcher6);
        java.lang.StringBuilder stringBuilder8 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor152");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str8 = strSubstitutor4.replace("a", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
    }

    @Test
    public void StrSubstitutor153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor153");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor4.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor154");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        boolean boolean7 = strSubstitutor4.isEnableSubstitutionInVariables();
        java.util.Properties properties8 = null;
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) boolean7, properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void StrSubstitutor155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor155");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor2.setVariablePrefix('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor2.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrSubstitutor156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor156");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix("");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor157");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        java.lang.StringBuffer stringBuffer7 = null;
        boolean boolean8 = strSubstitutor6.replaceIn(stringBuffer7);
        java.lang.Class<?> wildcardClass9 = strSubstitutor6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrSubstitutor158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor158");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = null;
        java.lang.String str6 = strSubstitutor0.replace(strBuilder3, (int) (byte) -1, (int) 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.StringBuffer stringBuffer8 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor159");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        java.lang.String str8 = strSubstitutor0.replace(strBuilder5, (int) (byte) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor160");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.util.Properties properties3 = null;
        java.lang.String str4 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) '4', properties3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4" + "'", str4.equals("4"));
    }

    @Test
    public void StrSubstitutor161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor161");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariablePrefix('$');
        java.lang.String str8 = strSubstitutor6.replace((java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4" + "'", str8.equals("4"));
    }

    @Test
    public void StrSubstitutor162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor162");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str7 = strSubstitutor2.replace(strBuilder6);
        java.lang.String str9 = strSubstitutor2.replace("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#" + "'", str9.equals("#"));
    }

    @Test
    public void StrSubstitutor163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor163");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        boolean boolean5 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuilder7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor164");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor4.getVariablePrefixMatcher();
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor4);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor4.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor165");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('#');
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor166");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuilder1, (int) (short) 0, (int) '$');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor167");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor168");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor169");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("-1");
        strSubstitutor0.setEscapeChar('$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor170");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('#');
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.String str9 = strSubstitutor0.replace(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor171");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str6 = strSubstitutor4.replace(stringBuffer5);
        java.lang.StringBuffer stringBuffer7 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor172");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        java.lang.String str8 = strSubstitutor4.replace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void StrSubstitutor173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor173");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor4.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor4.setVariableSuffix("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor174");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor4.getVariablePrefixMatcher();
        strSubstitutor4.setEscapeChar('$');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor4.setVariablePrefix('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor175");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor4.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str7 = strSubstitutor4.replace(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void StrSubstitutor176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor176");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        java.lang.String str8 = strSubstitutor2.replace(strBuilder5, (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor177");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix("false");
        java.lang.StringBuffer stringBuffer8 = null;
        boolean boolean9 = strSubstitutor7.replaceIn(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor178");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor0.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffixMatcher(strMatcher5);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor179");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor180");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        java.lang.StringBuffer stringBuffer7 = null;
        boolean boolean8 = strSubstitutor6.replaceIn(stringBuffer7);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup9 = strSubstitutor6.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup9);
    }

    @Test
    public void StrSubstitutor181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor181");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor1.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor1.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefixMatcher(strMatcher6);
        char char8 = strSubstitutor7.getEscapeChar();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor7.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '$' + "'", char8 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor182");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor0.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffixMatcher(strMatcher5);
        java.lang.Class<?> wildcardClass7 = strSubstitutor6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StrSubstitutor183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor183");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, 0, (-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder7);
        java.lang.Class<?> wildcardClass9 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrSubstitutor184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor184");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        boolean boolean5 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuilder7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor185");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor2.setVariablePrefixMatcher(strMatcher6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Variable prefix matcher must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
    }

    @Test
    public void StrSubstitutor186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor186");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('a');
        java.lang.StringBuffer stringBuffer8 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor187");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        java.lang.StringBuilder stringBuilder5 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuilder5, (int) (byte) -1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor188");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        strSubstitutor2.setEnableSubstitutionInVariables(false);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor2.setVariablePrefix("$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor189");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariablePrefix('$');
        char char7 = strSubstitutor6.getEscapeChar();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        java.lang.String str9 = strSubstitutor6.replace(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '$' + "'", char7 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor190");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str8 = strSubstitutor2.replace(stringBuffer5, 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor191");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) (short) 1, 0);
        char char7 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '$' + "'", char7 == '$');
    }

    @Test
    public void StrSubstitutor192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor192");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("0");
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor193");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(stringBuffer5, (int) (byte) 100, (int) ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor4.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor194");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.String str6 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor195");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix("false");
        java.lang.String str9 = strSubstitutor0.replace("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4" + "'", str9.equals("4"));
    }

    @Test
    public void StrSubstitutor196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor196");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        boolean boolean7 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        java.lang.String str9 = strSubstitutor0.replace(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor197");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor4.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor4.getVariableResolver();
        char char9 = strSubstitutor4.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
    }

    @Test
    public void StrSubstitutor198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor198");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void StrSubstitutor199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor199");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor2.setVariablePrefix('$');
        java.lang.String str8 = strSubstitutor2.replace((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void StrSubstitutor200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor200");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        java.lang.String str9 = strSubstitutor7.replace(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor201");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor4.getVariableResolver();
        strSubstitutor4.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor4.setVariablePrefix('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor202");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        boolean boolean7 = strSubstitutor0.isEnableSubstitutionInVariables();
        char char8 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '$' + "'", char8 == '$');
    }

    @Test
    public void StrSubstitutor203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor203");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariablePrefix("1.0");
        java.lang.StringBuilder stringBuilder6 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(stringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrSubstitutor204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor204");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('#');
        strSubstitutor0.setEscapeChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor205");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str9 = strSubstitutor0.replace("false", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor206");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor2.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        java.lang.String str8 = strSubstitutor2.replace(strBuilder5, (int) (byte) -1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor207");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor2.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor6.getVariableResolver();
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.String str9 = strSubstitutor6.replace(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor208");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        java.lang.String str6 = strSubstitutor4.replace(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void StrSubstitutor209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor209");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str7 = strSubstitutor2.replace(strBuilder6);
        java.lang.Class<?> wildcardClass8 = strSubstitutor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrSubstitutor210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor210");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("hi!");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor211");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor4);
        strSubstitutor4.setEnableSubstitutionInVariables(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
    }

    @Test
    public void StrSubstitutor212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor212");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        strSubstitutor0.setEscapeChar('#');
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#" + "'", str7.equals("#"));
    }

    @Test
    public void StrSubstitutor213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor213");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str8 = strSubstitutor2.replace("hi!", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
    }

    @Test
    public void StrSubstitutor214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor214");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) (short) 1, 0);
        java.lang.String str8 = strSubstitutor0.replace((java.lang.CharSequence) "10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0" + "'", str8.equals("10.0"));
    }

    @Test
    public void StrSubstitutor215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor215");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor216");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('#');
        boolean boolean8 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.lang.Class<?> wildcardClass9 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrSubstitutor217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor217");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
    }

    @Test
    public void StrSubstitutor218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor218");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariablePrefixMatcher();
        java.lang.StringBuffer stringBuffer6 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(stringBuffer6);
        java.util.Properties properties8 = null;
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) boolean7, properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void StrSubstitutor219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor219");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        java.lang.Class<?> wildcardClass5 = strMatcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StrSubstitutor220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor220");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariablePrefixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        boolean boolean9 = strSubstitutor0.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor221");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(strBuilder5, (int) (byte) 0, (int) '#');
        boolean boolean9 = strSubstitutor4.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor222");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.Class<?> wildcardClass9 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrSubstitutor223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor223");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor224");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('a');
        boolean boolean7 = strSubstitutor6.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        java.lang.String str9 = strSubstitutor6.replace(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor225");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        java.lang.String str6 = strSubstitutor4.replace("0");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(stringBuffer7);
        boolean boolean9 = strSubstitutor4.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor226");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix(" ");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor6.setVariableSuffix("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor227");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str6 = strSubstitutor4.replace(stringBuffer5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor4.setVariableSuffix('$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor228");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix("false");
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrSubstitutor229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor229");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strSubstitutor2.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrSubstitutor230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor230");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor2.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor2.replaceIn(strBuilder5);
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor2.replaceIn(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor231");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str8 = strSubstitutor2.replace((java.lang.CharSequence) "", (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StrSubstitutor232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor232");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        java.lang.String str8 = strSubstitutor6.replace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void StrSubstitutor233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor233");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor6.getVariablePrefixMatcher();
        java.lang.String str9 = strSubstitutor6.replace("-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1" + "'", str9.equals("-1"));
    }

    @Test
    public void StrSubstitutor234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor234");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuilder1, (int) (short) 0, (int) '$');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer5);
        java.lang.Class<?> wildcardClass7 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StrSubstitutor235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor235");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor4.getVariablePrefixMatcher();
        strSubstitutor4.setEscapeChar('$');
        java.lang.String str9 = strSubstitutor4.replace((java.lang.CharSequence) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void StrSubstitutor236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor236");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariableSuffix("1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor237");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void StrSubstitutor238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor238");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str2 = strSubstitutor0.replace(strBuilder1);
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (int) 'a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor239");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariablePrefixMatcher();
        char char7 = strSubstitutor0.getEscapeChar();
        java.lang.StringBuffer stringBuffer8 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '$' + "'", char7 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor240");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("1.0");
        java.lang.String str9 = strSubstitutor7.replace((java.lang.CharSequence) " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " " + "'", str9.equals(" "));
    }

    @Test
    public void StrSubstitutor241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor241");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuffer5, (int) (byte) -1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor242");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        boolean boolean5 = strSubstitutor2.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StrSubstitutor243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor243");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor2.setVariablePrefix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor2.setVariablePrefix('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor244");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor2.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor6.getVariableResolver();
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) wildcardStrLookup7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor245");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("1.0");
        boolean boolean5 = strSubstitutor0.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StrSubstitutor246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor246");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str8 = strSubstitutor4.replace((java.lang.CharSequence) "false", (int) '$', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
    }

    @Test
    public void StrSubstitutor247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor247");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix(" ");
        java.lang.String str8 = strSubstitutor6.replace((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StrSubstitutor248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor248");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor4.getVariableResolver();
        java.lang.String str7 = strSubstitutor4.replace("-1");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor4.setVariablePrefix("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1" + "'", str7.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor249");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(strBuilder6);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor250");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix(" ");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariablePrefixMatcher(strMatcher7);
        char char9 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
    }

    @Test
    public void StrSubstitutor251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor251");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        boolean boolean7 = strSubstitutor6.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor6.setVariableSuffix("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor252");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        strSubstitutor4.setEnableSubstitutionInVariables(true);
        java.lang.Class<?> wildcardClass9 = strSubstitutor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrSubstitutor253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor253");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
    }

    @Test
    public void StrSubstitutor254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor254");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor4);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor4.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor4.getVariableResolver();
        java.lang.StringBuffer stringBuffer8 = null;
        boolean boolean9 = strSubstitutor4.replaceIn(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor255");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(stringBuilder7);
        char char9 = strSubstitutor4.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void StrSubstitutor256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor256");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.String str8 = strSubstitutor6.replace("-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
    }

    @Test
    public void StrSubstitutor257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor257");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuilder1, (int) (short) 0, (int) '$');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor258");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor259");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariablePrefixMatcher();
        char char7 = strSubstitutor0.getEscapeChar();
        java.lang.String str9 = strSubstitutor0.replace("$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '$' + "'", char7 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "$" + "'", str9.equals("$"));
    }

    @Test
    public void StrSubstitutor260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor260");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("0");
        java.util.Properties properties7 = null;
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) "0", properties7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void StrSubstitutor261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor261");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor6.setVariableSuffix(" ");
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor262");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(strBuilder5, (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass9 = strSubstitutor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrSubstitutor263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor263");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        java.lang.String str8 = strSubstitutor0.replace(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor264");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix(" ");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder5, (int) (byte) 0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor265");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffixMatcher(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor266");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("");
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor6.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor267");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.StringBuilder stringBuilder6 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(stringBuilder6, (int) ' ', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor268");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(stringBuilder7);
        java.lang.Class<?> wildcardClass9 = strSubstitutor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrSubstitutor269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor269");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor270");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariablePrefix('$');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor271");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("");
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        java.util.Properties properties6 = null;
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
    }

    @Test
    public void StrSubstitutor272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor272");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor1 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor1.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor1.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor1.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefixMatcher(strMatcher6);
        java.lang.Class<?> wildcardClass8 = strSubstitutor7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrSubstitutor273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor273");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor4);
        strSubstitutor4.setEscapeChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
    }

    @Test
    public void StrSubstitutor274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor274");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("-1");
        java.util.Properties properties7 = null;
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) "-1", properties7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
    }

    @Test
    public void StrSubstitutor275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor275");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        java.util.Properties properties7 = null;
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor4, properties7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor276");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor2.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor277");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor2.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor6.setVariablePrefix(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor278");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        java.lang.String str6 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strMatcher5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffixMatcher(strMatcher5);
        java.lang.StringBuffer stringBuffer8 = null;
        boolean boolean9 = strSubstitutor7.replaceIn(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor279");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        java.lang.String str6 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strMatcher5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffixMatcher(strMatcher5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariablePrefix(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor280");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        char char5 = strSubstitutor4.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '$' + "'", char5 == '$');
    }

    @Test
    public void StrSubstitutor281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor281");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor282");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) (short) 1, 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        java.lang.String str8 = strSubstitutor0.replace(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor283");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        boolean boolean7 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.lang.String str9 = strSubstitutor0.replace("10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0" + "'", str9.equals("10.0"));
    }

    @Test
    public void StrSubstitutor284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor284");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        java.lang.StringBuilder stringBuilder5 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuilder5, (int) (short) 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor285");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        java.lang.StringBuffer stringBuffer6 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(stringBuffer6, (int) 'a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor286");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('$');
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer7);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup9 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup9);
    }

    @Test
    public void StrSubstitutor287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor287");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        strSubstitutor0.setEscapeChar('#');
        java.lang.String str8 = strSubstitutor0.replace("a");
        char char9 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "a" + "'", str8.equals("a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '#' + "'", char9 == '#');
    }

    @Test
    public void StrSubstitutor288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor288");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str8 = strSubstitutor0.replace((java.lang.CharSequence) " ", (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrSubstitutor289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor289");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('a');
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor290");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("");
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void StrSubstitutor291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor291");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = null;
        java.lang.String str6 = strSubstitutor0.replace(strBuilder3, (int) (byte) -1, (int) 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrSubstitutor292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor292");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor2.replaceIn(stringBuffer3, 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor293");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.util.Properties properties5 = null;
        java.lang.String str6 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor4, properties5);
        boolean boolean7 = strSubstitutor4.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrSubstitutor294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor294");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix("10.0");
        java.lang.String str8 = strSubstitutor6.replace((java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4" + "'", str8.equals("4"));
    }

    @Test
    public void StrSubstitutor295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor295");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(stringBuilder7);
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void StrSubstitutor296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor296");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(strBuilder5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor4.setVariablePrefix('$');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor4.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor297");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        char char5 = strSubstitutor4.getEscapeChar();
        java.lang.StringBuilder stringBuilder6 = null;
        boolean boolean7 = strSubstitutor4.replaceIn(stringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '$' + "'", char5 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrSubstitutor298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor298");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariablePrefixMatcher();
        char char7 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariableSuffix("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '$' + "'", char7 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor299");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup8);
    }

    @Test
    public void StrSubstitutor300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor300");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix(' ');
        boolean boolean7 = strSubstitutor6.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        boolean boolean9 = strSubstitutor6.replaceIn(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor301");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.StringBuilder stringBuilder4 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(stringBuilder4, (int) (short) 0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrSubstitutor302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor302");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.String str5 = strSubstitutor0.replace(stringBuffer4);
        strSubstitutor0.setEscapeChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void StrSubstitutor303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor303");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor6.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrSubstitutor304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor304");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str8 = strSubstitutor2.replace(stringBuffer5, 100, 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor2.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor305");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor4.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor8.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor306");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('#');
        char char8 = strSubstitutor0.getEscapeChar();
        char char9 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '#' + "'", char8 == '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '#' + "'", char9 == '#');
    }

    @Test
    public void StrSubstitutor307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor307");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4" + "'", str5.equals("4"));
    }

    @Test
    public void StrSubstitutor308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor308");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        boolean boolean5 = strSubstitutor2.isEnableSubstitutionInVariables();
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.String str7 = strSubstitutor2.replace(stringBuffer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void StrSubstitutor309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor309");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariablePrefix("1.0");
        java.lang.String str7 = strSubstitutor5.replace("1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1.0" + "'", str7.equals("1.0"));
    }

    @Test
    public void StrSubstitutor310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor310");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str2 = strSubstitutor0.replace(strBuilder1);
        java.lang.String str4 = strSubstitutor0.replace((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder5, (int) (short) -1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor311");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.Object obj6 = null;
        java.lang.String str7 = strSubstitutor0.replace(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void StrSubstitutor312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor312");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("1.0");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(strBuilder5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor4.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrSubstitutor313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor313");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuilder1, (int) (short) 0, (int) '$');
        boolean boolean5 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.String str9 = strSubstitutor0.replace(stringBuffer6, 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor314");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('#');
        boolean boolean7 = strSubstitutor6.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrSubstitutor315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor315");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor4.setVariableSuffix('a');
        char char9 = strSubstitutor4.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
    }

    @Test
    public void StrSubstitutor316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor316");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        java.lang.String str8 = strSubstitutor4.replace(strBuilder5, (int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor4.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor317");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariablePrefixMatcher();
        java.util.Properties properties7 = null;
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor318");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffix('#');
        java.lang.StringBuffer stringBuffer8 = null;
        boolean boolean9 = strSubstitutor7.replaceIn(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor319");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("a");
        strSubstitutor0.setEscapeChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor320");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        boolean boolean7 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.lang.String str9 = strSubstitutor0.replace((java.lang.CharSequence) " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " " + "'", str9.equals(" "));
    }

    @Test
    public void StrSubstitutor321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor321");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuilder1, (int) (short) 0, (int) '$');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer5);
        java.lang.StringBuilder stringBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor322");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor2.setVariableSuffix("#");
        strSubstitutor6.setEnableSubstitutionInVariables(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor323");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor4.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str7 = strSubstitutor4.replace(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void StrSubstitutor324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor324");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix(" ");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrSubstitutor325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor325");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariablePrefix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor5.setVariablePrefix('#');
        java.util.Properties properties8 = null;
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) '#', properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#" + "'", str9.equals("#"));
    }

    @Test
    public void StrSubstitutor326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor326");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariablePrefix("1.0");
        java.lang.String str7 = strSubstitutor5.replace((java.lang.CharSequence) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void StrSubstitutor327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor327");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariablePrefix('a');
        java.lang.String str8 = strSubstitutor6.replace((java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4" + "'", str8.equals("4"));
    }

    @Test
    public void StrSubstitutor328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor328");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("");
        java.lang.String str6 = strSubstitutor0.replace((java.lang.CharSequence) "$");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor0.getVariablePrefixMatcher();
        java.lang.String str9 = strSubstitutor0.replace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "$" + "'", str6.equals("$"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StrSubstitutor329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor329");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void StrSubstitutor330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor330");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4" + "'", str1.equals("4"));
    }

    @Test
    public void StrSubstitutor331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor331");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("");
        strSubstitutor0.setEscapeChar('#');
        java.lang.StringBuffer stringBuffer7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor332");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuilder3, (int) (short) 1, 0);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor333");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariablePrefixMatcher();
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor334");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor2.setVariablePrefix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor2.setVariablePrefix("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor335");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        java.lang.String str6 = strSubstitutor4.replace("0");
        java.lang.String str8 = strSubstitutor4.replace("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "a" + "'", str8.equals("a"));
    }

    @Test
    public void StrSubstitutor336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor336");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuilder1, (int) (short) 0, (int) '$');
        java.lang.StringBuilder stringBuilder5 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuilder5, 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor337");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        boolean boolean6 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.lang.String str8 = strSubstitutor0.replace("-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
    }

    @Test
    public void StrSubstitutor338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor338");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup9 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup9);
    }

    @Test
    public void StrSubstitutor339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor339");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean6 = strSubstitutor2.replaceIn(stringBuilder3, (-1), (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor340");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.String str6 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrSubstitutor341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor341");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix("$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor342");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        // The following exception was thrown during execution in StrSubstitutor generation
        try {
            java.lang.String str8 = strSubstitutor2.replace((java.lang.CharSequence) "1.0", (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StrSubstitutor343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor343");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        java.lang.String str6 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
    }

    @Test
    public void StrSubstitutor344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor344");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str6 = strSubstitutor4.replace(stringBuffer5);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor4.replaceIn(strBuilder7);
        boolean boolean9 = strSubstitutor4.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor345");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str7 = strSubstitutor2.replace(strBuilder6);
        boolean boolean8 = strSubstitutor2.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor346");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEscapeChar('a');
        java.lang.Class<?> wildcardClass8 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrSubstitutor347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor347");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor0.replace(stringBuffer3);
        java.lang.StringBuilder stringBuilder5 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuilder5, (int) (short) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor348");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("10.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariablePrefix('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor349");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void StrSubstitutor350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor350");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.lang.String str5 = strSubstitutor0.replace((java.lang.CharSequence) "-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
    }

    @Test
    public void StrSubstitutor351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor351");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        java.lang.String str8 = strSubstitutor0.replace("-1", (int) (short) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-" + "'", str8.equals("-"));
    }

    @Test
    public void StrSubstitutor352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor352");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder5, (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor353");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor0.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffixMatcher(strMatcher5);
        java.lang.String str8 = strSubstitutor6.replace("1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0" + "'", str8.equals("1.0"));
    }

    @Test
    public void StrSubstitutor354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor354");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) 1, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void StrSubstitutor355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor355");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        java.lang.String str9 = strSubstitutor7.replace(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor356");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, 0, (-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder7);
        char char9 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
    }

    @Test
    public void StrSubstitutor357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor357");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("a");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor6.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrSubstitutor358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor358");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.String str5 = strSubstitutor0.replace(stringBuffer4);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrSubstitutor359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor359");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor6.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        java.lang.String str9 = strSubstitutor6.replace(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor360");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("");
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str8 = strSubstitutor4.replace(stringBuffer5, (int) (byte) 10, (int) (byte) -1);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor4.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor361");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor4.getVariableResolver();
        java.lang.String str7 = strSubstitutor4.replace(" ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " " + "'", str7.equals(" "));
    }

    @Test
    public void StrSubstitutor362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor362");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor363");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor2.replaceIn(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor364");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup6 = strSubstitutor2.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup6);
    }

    @Test
    public void StrSubstitutor365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor365");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix('#');
        strSubstitutor6.setEnableSubstitutionInVariables(true);
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "true" + "'", str9.equals("true"));
    }

    @Test
    public void StrSubstitutor366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor366");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor2.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor2.replaceIn(strBuilder5);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor2.replaceIn(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor367");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrSubstitutor368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor368");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor4.getVariablePrefixMatcher();
        java.lang.String str9 = strSubstitutor4.replace((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void StrSubstitutor369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor369");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        strSubstitutor0.setEscapeChar('#');
        java.lang.String str8 = strSubstitutor0.replace("-");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-" + "'", str8.equals("-"));
    }

    @Test
    public void StrSubstitutor370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor370");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, 0, (-1));
        boolean boolean7 = strSubstitutor0.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrSubstitutor371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor371");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(strBuilder3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
    }

    @Test
    public void StrSubstitutor372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor372");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor6.getVariableSuffixMatcher();
        java.util.Properties properties8 = null;
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor6, properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrSubstitutor373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor373");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("");
        java.lang.Class<?> wildcardClass8 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrSubstitutor374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor374");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor0.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffixMatcher(strMatcher5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariableSuffix('$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor375");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix("10.0");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor376");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("a");
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor0.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
    }

    @Test
    public void StrSubstitutor377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor377");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor2.replace(stringBuffer3);
        char char5 = strSubstitutor2.getEscapeChar();
        java.lang.String str7 = strSubstitutor2.replace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '$' + "'", char5 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void StrSubstitutor378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor378");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix("10.0");
        java.lang.String str8 = strSubstitutor6.replace("-");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-" + "'", str8.equals("-"));
    }

    @Test
    public void StrSubstitutor379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor379");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor0.getVariableResolver();
        char char8 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor380");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        char char5 = strSubstitutor4.getEscapeChar();
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.String str7 = strSubstitutor4.replace(stringBuffer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '$' + "'", char5 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void StrSubstitutor381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor381");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor4);
        java.lang.StringBuilder stringBuilder6 = null;
        boolean boolean9 = strSubstitutor4.replaceIn(stringBuilder6, (int) (short) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor382");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.Class<?> wildcardClass6 = strSubstitutor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StrSubstitutor383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor383");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        boolean boolean8 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void StrSubstitutor384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor384");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariablePrefix('a');
        strSubstitutor6.setEnableSubstitutionInVariables(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor385");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str7 = strSubstitutor2.replace(strBuilder6);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor2.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup8);
    }

    @Test
    public void StrSubstitutor386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor386");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        java.lang.String str8 = strSubstitutor6.replace(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor387");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor4);
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.String str7 = strSubstitutor4.replace(stringBuffer6);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor4.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor4.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor388");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(strBuilder5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor4.setVariablePrefix('$');
        char char9 = strSubstitutor8.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
    }

    @Test
    public void StrSubstitutor389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor389");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor2.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor6.getVariablePrefixMatcher();
        java.util.Properties properties8 = null;
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strMatcher7, properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrSubstitutor390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor390");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.util.Properties properties3 = null;
        java.lang.String str4 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) '4', properties3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4" + "'", str4.equals("4"));
    }

    @Test
    public void StrSubstitutor391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor391");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix(' ');
        strSubstitutor4.setEscapeChar('#');
        java.lang.String str9 = strSubstitutor0.replace((java.lang.Object) strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor392");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariableSuffix("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor393");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor4.setVariablePrefix('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor4.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor394");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("");
        java.lang.StringBuilder stringBuilder5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor395");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void StrSubstitutor396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor396");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        java.lang.StringBuffer stringBuffer6 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(stringBuffer6);
        java.lang.String str8 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) stringBuffer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor397");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("");
        char char7 = strSubstitutor6.getEscapeChar();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor6.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '$' + "'", char7 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup8);
    }

    @Test
    public void StrSubstitutor398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor398");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor2.replace(stringBuffer3);
        char char5 = strSubstitutor2.getEscapeChar();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup6 = strSubstitutor2.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '$' + "'", char5 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup6);
    }

    @Test
    public void StrSubstitutor399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor399");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor4);
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.String str7 = strSubstitutor4.replace(stringBuffer6);
        java.lang.String str9 = strSubstitutor4.replace("-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1" + "'", str9.equals("-1"));
    }

    @Test
    public void StrSubstitutor400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor400");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        boolean boolean7 = strSubstitutor6.isEnableSubstitutionInVariables();
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = strSubstitutor6.replace(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor401");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariablePrefix('4');
        strSubstitutor4.setEnableSubstitutionInVariables(false);
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
    }

    @Test
    public void StrSubstitutor402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor402");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor2.getVariableSuffixMatcher();
        java.lang.StringBuilder stringBuilder6 = null;
        boolean boolean9 = strSubstitutor2.replaceIn(stringBuilder6, (int) (byte) 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor403");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        java.lang.String str9 = strSubstitutor0.replace(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor404");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix("10.0");
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.String str8 = strSubstitutor0.replace(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor405");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str2 = strSubstitutor0.replace(strBuilder1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strSubstitutor0.getVariableSuffixMatcher();
        java.util.Properties properties4 = null;
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties4);
        java.lang.StringBuffer stringBuffer6 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(stringBuffer6, 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor406");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        java.lang.String str8 = strSubstitutor4.replace(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrSubstitutor407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor407");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariableSuffix("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor408");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor2.replace(stringBuffer3);
        char char5 = strSubstitutor2.getEscapeChar();
        boolean boolean6 = strSubstitutor2.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '$' + "'", char5 == '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor409");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) (short) 1, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void StrSubstitutor410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor410");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("1.0");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor4.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str9 = strSubstitutor4.replace(strBuilder6, 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor411");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor2.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor2.setVariableSuffix('$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
    }

    @Test
    public void StrSubstitutor412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor412");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.String str5 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor4);
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.String str7 = strSubstitutor4.replace(stringBuffer6);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor4.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup8);
    }

    @Test
    public void StrSubstitutor413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor413");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariablePrefix('a');
        boolean boolean9 = strSubstitutor8.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor414");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(strBuilder6);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrSubstitutor415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor415");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(strBuilder3);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor2.replaceIn(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor416");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str9 = strSubstitutor0.replace(strBuilder6, (int) '4', (int) '$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrSubstitutor417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor417");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str8 = strSubstitutor2.replace(stringBuffer5, 0, (int) (short) 10);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor2.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrSubstitutor418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor418");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        boolean boolean7 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.util.Properties properties8 = null;
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) boolean7, properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void StrSubstitutor419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor419");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        java.lang.String str6 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strMatcher5);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariableSuffixMatcher(strMatcher5);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor420");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix(" ");
        java.lang.String str6 = strSubstitutor4.replace((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor4.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrSubstitutor421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor421");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrSubstitutor422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor422");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("$");
        java.lang.String str8 = strSubstitutor0.replace((java.lang.CharSequence) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void StrSubstitutor423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor423");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(strBuilder5, (int) (byte) 1, 100);
        char char9 = strSubstitutor0.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
    }

    @Test
    public void StrSubstitutor424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor424");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        strSubstitutor2.setEscapeChar(' ');
        char char5 = strSubstitutor2.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ' ' + "'", char5 == ' ');
    }

    @Test
    public void StrSubstitutor425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor425");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (-1), (int) (byte) -1);
        boolean boolean7 = strSubstitutor0.isEnableSubstitutionInVariables();
        boolean boolean8 = strSubstitutor0.isEnableSubstitutionInVariables();
        boolean boolean9 = strSubstitutor0.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor426");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariableSuffix(" ");
        strSubstitutor6.setEscapeChar('$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void StrSubstitutor427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor427");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = null;
        java.lang.String str4 = strSubstitutor0.replace(strBuilder1, 0, 100);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor0.setVariablePrefix("10.0");
        java.lang.StringBuilder stringBuilder8 = null;
        boolean boolean9 = strSubstitutor0.replaceIn(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor428");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        char char6 = strSubstitutor0.getEscapeChar();
        strSubstitutor0.setEscapeChar(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '4' + "'", char6 == '4');
    }

    @Test
    public void StrSubstitutor429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor429");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        boolean boolean4 = strSubstitutor0.isEnableSubstitutionInVariables();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StrSubstitutor430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor430");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = null;
        java.lang.String str7 = strSubstitutor2.replace(strBuilder6);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor2.setVariablePrefix("10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor9);
    }

    @Test
    public void StrSubstitutor431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor431");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor4.getVariableSuffixMatcher();
        java.lang.StringBuilder stringBuilder6 = null;
        boolean boolean9 = strSubstitutor4.replaceIn(stringBuilder6, (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor432");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("1.0");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix("false");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean boolean8 = strSubstitutor0.replaceIn(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrSubstitutor433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor433");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer3, (int) (byte) 0, 0);
        java.lang.String str8 = strSubstitutor0.replace((java.lang.CharSequence) "-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
    }

    @Test
    public void StrSubstitutor434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor434");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str6 = strSubstitutor0.replace(stringBuffer3, (int) (byte) 0, 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor0.setVariablePrefixMatcher(strMatcher7);
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor435");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix("");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor6.setVariableSuffix('$');
        java.lang.String str9 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor8);
    }

    @Test
    public void StrSubstitutor436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor436");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('a');
        java.lang.String str8 = strSubstitutor6.replace("1.0");
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup9 = strSubstitutor6.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0" + "'", str8.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup9);
    }

    @Test
    public void StrSubstitutor437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor437");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor4.getVariableResolver();
        char char6 = strSubstitutor4.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '$' + "'", char6 == '$');
    }

    @Test
    public void StrSubstitutor438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor438");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        boolean boolean7 = strSubstitutor4.isEnableSubstitutionInVariables();
        java.lang.StringBuilder stringBuilder8 = null;
        boolean boolean9 = strSubstitutor4.replaceIn(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrSubstitutor439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor439");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor0.getVariableResolver();
        strSubstitutor0.setEscapeChar('$');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup7);
    }

    @Test
    public void StrSubstitutor440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor440");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor4.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor4.setVariableSuffix("$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
    }

    @Test
    public void StrSubstitutor441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor441");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor4.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor4.setVariablePrefix("-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
    }

    @Test
    public void StrSubstitutor442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor442");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuffer stringBuffer1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuffer1, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor0.setVariablePrefix('$');
        java.lang.String str8 = strSubstitutor6.replace((java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4" + "'", str8.equals("4"));
    }

    @Test
    public void StrSubstitutor443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor443");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.String str6 = strSubstitutor4.replace(stringBuffer5);
        char char7 = strSubstitutor4.getEscapeChar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '$' + "'", char7 == '$');
    }

    @Test
    public void StrSubstitutor444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor444");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor2.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor2.setVariablePrefix("-");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor7);
    }

    @Test
    public void StrSubstitutor445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor445");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        boolean boolean7 = strSubstitutor4.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor4.getVariableResolver();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardStrLookup8);
    }

    @Test
    public void StrSubstitutor446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.StrSubstitutor446");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEscapeChar('#');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strSubstitutor0.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }
}

