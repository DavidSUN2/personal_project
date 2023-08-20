package StringEscapeUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringEscapeUtils0 {

    public static boolean debug = false;

    @Test
    public void StringEscapeUtils01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils01");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJson("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils02");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeCsv("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils03");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils04");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeCsv("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils05");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeXml("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils06");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeCsv("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils07");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils08");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeXml("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils09");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJson("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils10");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJava("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils11");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJava("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils12");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJson("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils13");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils14");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils15");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJson("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils16");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils17");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJava("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils18");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils19");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JSON;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils20");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils21");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils22");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeXml("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils23");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeXml("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils24");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils25");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils26");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JAVA;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils27");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeCsv("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils28");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.escapeJava("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils29");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringEscapeUtils30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils30");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_CSV;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils31");
        java.lang.String str1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringEscapeUtils32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils32");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML3;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils33");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML4;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JAVA;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils35");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils36");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_CSV;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils37");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML3;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils38");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils39");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_ECMASCRIPT;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils40");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_XML;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils41");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_ECMASCRIPT;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils42");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JSON;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils43");
        org.apache.commons.lang3.StringEscapeUtils stringEscapeUtils0 = new org.apache.commons.lang3.StringEscapeUtils();
        java.lang.Class<?> wildcardClass1 = stringEscapeUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StringEscapeUtils44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringEscapeUtils0.StringEscapeUtils44");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML4;
        java.lang.Class<?> wildcardClass1 = charSequenceTranslator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

