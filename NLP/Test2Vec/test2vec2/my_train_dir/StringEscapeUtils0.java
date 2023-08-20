
package StringEscapeUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringEscapeUtils0 {

    public static boolean debug = false;

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test01");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJson("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test02");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeCsv("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test03");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test04");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeCsv("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test05");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeXml("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test06");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeCsv("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test07");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test08");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeXml("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test09");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJson("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test10");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJava("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test11");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJava("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test12");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJson("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test13");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test14");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test15");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJson("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test16");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test17");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJava("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test18");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test19");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JSON;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test20");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test21");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test22");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeXml("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test23");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeXml("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test24");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test25");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test26");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JAVA;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test27");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeCsv("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test28");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJava("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test29");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test30");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_CSV;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test31");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test32");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML3;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test33");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML4;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JAVA;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test35");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test36");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_CSV;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test37");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML3;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test38");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test39");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_ECMASCRIPT;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test40");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_XML;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test41");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_ECMASCRIPT;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test42");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JSON;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test43");
        org.apache.commons.lang3.StringEscapeUtils stringEscapeUtils0 = new org.apache.commons.lang3.StringEscapeUtils();
        java.lang.Class<?> wildcardClass1 = stringEscapeUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test44");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML4;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

