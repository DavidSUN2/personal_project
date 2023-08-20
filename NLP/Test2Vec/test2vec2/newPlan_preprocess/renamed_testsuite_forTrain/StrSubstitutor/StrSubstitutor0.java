
package StrSubstitutor;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrSubstitutor0 {

    public static boolean debug = false;

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test001");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffixMatcher(strMatcher1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Variable suffix matcher must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test002");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strSubstitutor0.replace((java.lang.CharSequence) "hi!", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test003");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test004");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) (-1L), properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1" + "'", str2.equals("-1"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test005");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test006");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test007");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test008");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test009");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test010");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) 10.0d, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test011");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test012");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test013");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        boolean boolean3 = strSubstitutor0.isEnableSubstitutionInVariables();
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test014");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test015");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test016");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test017");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test018");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test019");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix('a');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup6 = strSubstitutor0.getVariableResolver();
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test020");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test021");
        char char0 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_ESCAPE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '$' + "'", char0 == '$');
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test022");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test023");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test024");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test025");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test026");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test027");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test028");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test029");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test030");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test031");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test032");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test033");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test034");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test035");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test036");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test037");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test038");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test039");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test040");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test041");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test042");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test043");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test044");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test045");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        char[] charArray4 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test046");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test047");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test048");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test049");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test050");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test051");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test052");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test053");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test054");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test055");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test056");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test057");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test058");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test059");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test060");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test061");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test062");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test063");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test064");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test065");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test066");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test067");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test068");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test069");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test070");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test071");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test072");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test073");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test074");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test075");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test076");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test077");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test078");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test079");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test080");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test081");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test082");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test083");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test084");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test085");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test086");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test087");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test088");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test089");
        java.lang.Object obj0 = null;
        java.util.Properties properties1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace(obj0, properties1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test090");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test091");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test092");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test093");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test094");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test095");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test096");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test097");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test098");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test099");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix(" ");
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test100");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test101");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test102");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test103");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test104");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test105");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test106");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test107");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test108");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test109");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test110");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test111");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test112");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean2 = strSubstitutor0.replaceIn(stringBuilder1);
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test113");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test114");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test115");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("1.0");
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test116");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test117");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test118");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test119");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test120");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test121");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test122");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test123");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test124");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str2 = strSubstitutor0.replace("10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test125");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test126");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test127");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test128");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test129");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test130");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test131");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        java.lang.String str3 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + " " + "'", str3.equals(" "));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test132");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test133");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) (byte) -1, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1" + "'", str2.equals("-1"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test134");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test135");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test136");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test137");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test138");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test139");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test140");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test141");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test142");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test143");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test144");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test145");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test146");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test147");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffix("1.0");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean boolean6 = strSubstitutor4.replaceIn(stringBuffer5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strSubstitutor4.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup8 = strSubstitutor4.getVariableResolver();
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test148");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test149");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        java.lang.String str3 = strSubstitutor0.replace((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test150");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test151");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test152");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariablePrefix("#");
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test153");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test154");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test155");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test156");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test157");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test158");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test159");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test160");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        java.util.Properties properties3 = null;
        java.lang.String str4 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) '4', properties3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4" + "'", str4.equals("4"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test161");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test162");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test163");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test164");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test165");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test166");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test167");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test168");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test169");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test170");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test171");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test172");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test173");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test174");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test175");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test176");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test177");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test178");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test179");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test180");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test181");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test182");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test183");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test184");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test185");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup5 = strSubstitutor2.getVariableResolver();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test186");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test187");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test188");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test189");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test190");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test191");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test192");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test193");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test194");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test195");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test196");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test197");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test198");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test199");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test200");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test201");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test202");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test203");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test204");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test205");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor0, properties1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor0.setVariableSuffixMatcher(strMatcher3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strSubstitutor0.getVariableSuffixMatcher();
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test206");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test207");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test208");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test209");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test210");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test211");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test212");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        strSubstitutor0.setEscapeChar('#');
        java.lang.String str7 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#" + "'", str7.equals("#"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test213");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test214");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test215");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test216");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test217");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test218");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test219");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test220");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test221");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test222");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test223");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test224");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test225");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test226");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test227");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test228");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test229");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strSubstitutor2.getVariablePrefixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSubstitutor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test230");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test231");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuffer3);
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test232");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test233");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test234");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test235");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test236");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test237");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test238");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test239");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test240");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test241");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test242");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test243");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test244");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test245");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test246");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = strSubstitutor2.setVariableSuffix('4');
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test247");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test248");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test249");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test250");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test251");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test252");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test253");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test254");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test255");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test256");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test257");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test258");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test259");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test260");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test261");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test262");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test263");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test264");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test265");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test266");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test267");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test268");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test269");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test270");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test271");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test272");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test273");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test274");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test275");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test276");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test277");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test278");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test279");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test280");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test281");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test282");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test283");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test284");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test285");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test286");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test287");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test288");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strSubstitutor0.replace((java.lang.CharSequence) " ", (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test289");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test290");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test291");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test292");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test293");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test294");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test295");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test296");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test297");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test298");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test299");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test300");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test301");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) strSubstitutor0);
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.StringBuilder stringBuilder4 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(stringBuilder4, (int) (short) 0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test302");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test303");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test304");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test305");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test306");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test307");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test308");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test309");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test310");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test311");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test312");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test313");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test314");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test315");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test316");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test317");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test318");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test319");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test320");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test321");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test322");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test323");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test324");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test325");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test326");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test327");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test328");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test329");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test330");
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties((java.lang.Object) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4" + "'", str1.equals("4"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test331");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test332");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test333");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test334");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test335");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test336");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test337");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test338");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test339");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test340");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test341");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test342");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffix('4');
        java.lang.StringBuilder stringBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(stringBuilder3);
        // The following exception was thrown during execution in test generation
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test343");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test344");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test345");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test346");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test347");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test348");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test349");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test350");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test351");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        java.lang.String str8 = strSubstitutor0.replace("-1", (int) (short) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-" + "'", str8.equals("-"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test352");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test353");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test354");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) 1, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test355");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test356");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test357");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test358");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test359");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test360");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test361");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test362");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test363");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test364");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test365");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test366");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test367");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strSubstitutor0.getVariableSuffixMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test368");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test369");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        strSubstitutor0.setEscapeChar('4');
        strSubstitutor0.setEscapeChar(' ');
        strSubstitutor0.setEscapeChar('#');
        java.lang.String str8 = strSubstitutor0.replace("-");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-" + "'", str8.equals("-"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test370");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test371");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test372");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test373");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test374");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test375");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test376");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test377");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test378");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test379");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test380");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test381");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test382");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test383");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test384");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test385");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test386");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test387");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test388");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test389");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test390");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test391");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test392");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test393");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test394");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test395");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test396");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test397");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test398");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test399");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test400");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test401");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test402");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test403");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test404");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test405");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test406");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test407");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test408");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test409");
        java.util.Properties properties1 = null;
        java.lang.String str2 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) (short) 1, properties1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test410");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test411");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test412");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test413");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test414");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test415");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test416");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test417");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test418");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test419");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test420");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test421");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test422");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test423");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test424");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test425");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test426");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test427");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test428");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test429");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test430");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test431");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test432");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test433");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test434");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test435");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test436");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test437");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test438");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test439");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test440");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test441");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test442");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test443");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test444");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test445");
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
    public void StrSubstitutor() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrSubstitutor0.test446");
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

