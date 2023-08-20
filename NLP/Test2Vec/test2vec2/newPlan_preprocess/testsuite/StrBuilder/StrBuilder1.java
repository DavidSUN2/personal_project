package StrBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrBuilder1 {

    public static boolean debug = false;

    @Test
    public void StrBuilder501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder1.StrBuilder501");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 0);
        java.lang.String str6 = strBuilder1.midString((int) (byte) 10, (int) (short) -1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder1.StrBuilder502");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder1.StrBuilder503");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        java.lang.String str4 = strBuilder1.getNullText();
        int int6 = strBuilder1.indexOf("0.0\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StrBuilder504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder1.StrBuilder504");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) (short) 10, 10, '\r');
        // The following exception was thrown during execution in StrBuilder generation
        try {
            java.lang.CharSequence charSequence8 = strBuilder1.subSequence((int) '1', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder1.StrBuilder505");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert(0, 100);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.appendln((int) (byte) -1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.appendln(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }
}

