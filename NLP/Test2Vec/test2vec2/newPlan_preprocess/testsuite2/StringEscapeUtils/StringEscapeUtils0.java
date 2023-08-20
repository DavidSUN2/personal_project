package StringEscapeUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringEscapeUtils0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test01");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeCsv("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test02");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJson("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test03");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJson("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test04");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test05");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeXml("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test06");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test07");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test08");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML3;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test09");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJava("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test10");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeXml("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test11");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test12");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJson("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test13");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeCsv("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test14");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_ECMASCRIPT;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test15");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test16");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeCsv("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test17");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeXml("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test18");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test19");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeCsv("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test20");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test21");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test22");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JSON;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test23");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test24");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJava("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test25");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JAVA;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test26");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJava("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test27");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test28");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test29");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJson("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test30");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML4;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test31");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JAVA;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test32");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJava("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test33");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML3;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test35");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeXml("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test36");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_CSV;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test37");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_XML;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test38");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_ECMASCRIPT;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test39");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test40");
        org.apache.commons.lang3.StringEscapeUtils stringEscapeUtils0 = new org.apache.commons.lang3.StringEscapeUtils();
        java.lang.Class<?> wildcardClass1 = stringEscapeUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test41");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_CSV;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test42");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML4;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test43");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.test44");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JSON;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

