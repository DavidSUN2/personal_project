package ExtendedMessageFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExtendedMessageFormat1 {

    public static boolean debug = false;

    @Test
    public void ExtendedMessageFormat501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat501");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat502");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat1.setFormat((int) (byte) 1, (java.text.Format) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void ExtendedMessageFormat503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat503");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat504");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj9 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat505");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object obj5 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat506");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.util.Locale locale8 = extendedMessageFormat6.getLocale();
        java.lang.Object obj9 = extendedMessageFormat6.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat507");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass8 = formatArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat508");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat509");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Locale locale8 = extendedMessageFormat4.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void ExtendedMessageFormat510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat510");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        extendedMessageFormat1.setLocale(locale5);
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat511");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass4 = formatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ExtendedMessageFormat512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat512");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat4.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat513");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat514");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.lang.Object obj5 = extendedMessageFormat3.parseObject("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat515");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass8 = formatArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat516");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray6);
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray6);
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat517");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        boolean boolean7 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat5);
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat518");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat519");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat520");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat521");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.Object obj6 = extendedMessageFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat522");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat523");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat524");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.String str8 = extendedMessageFormat5.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat525");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat526");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void ExtendedMessageFormat527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat527");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat528");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat529");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj3 = extendedMessageFormat2.clone();
        java.lang.Class<?> wildcardClass4 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ExtendedMessageFormat530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat530");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat531");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat532");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat533");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat534");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat535");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.Object[] objArray6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat5.format(objArray6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat536");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat537");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat538");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat6.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat539");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat540");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat541");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.util.Locale locale8 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat542");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat543");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void ExtendedMessageFormat544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat544");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat545");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.Class<?> wildcardClass6 = locale4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat546");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) -1, (java.text.Format) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat547");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void ExtendedMessageFormat548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat548");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object obj6 = null;
        java.lang.String str7 = extendedMessageFormat1.format(obj6);
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat549");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat550");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat551");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj6 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat552");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat553");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass7 = formatArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat554");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat555");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat556");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat557");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat558");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat559");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat560");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat561");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        java.lang.String str9 = extendedMessageFormat6.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat562");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj3 = extendedMessageFormat1.parseObject("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void ExtendedMessageFormat563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat563");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat564");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.Object obj5 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat565");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat566");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat567");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!");
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat568");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        boolean boolean8 = extendedMessageFormat2.equals((java.lang.Object) "hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat569");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat570");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat571");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat572");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        java.lang.Class<?> wildcardClass8 = formatArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat573");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat574");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass6 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat575");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object obj6 = null;
        java.lang.String str7 = extendedMessageFormat1.format(obj6);
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat576");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat577");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat578");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat579");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat580");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat581");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat582");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat583");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat584");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        extendedMessageFormat5.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat585");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat586");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat587");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat588");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat589");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat590");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat591");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat592");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat593");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat594");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat595");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat596");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void ExtendedMessageFormat597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat597");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat5.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat598");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat599");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat7.setFormatsByArgumentIndex(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat600");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat601");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat2.format(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat602");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat603");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat5.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat604");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat605");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat606");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat1.parse("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat607");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat6.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat608");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean8 = extendedMessageFormat6.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ExtendedMessageFormat609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat609");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat610");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat611");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat612");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ExtendedMessageFormat613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat613");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat614");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat615");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat616");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat617");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat618");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void ExtendedMessageFormat619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat619");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.lang.Object obj6 = extendedMessageFormat2.parseObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat620");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format format8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (short) -1, format8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat621");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat622");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.lang.Object obj6 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat623");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat624");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat625");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat626");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.lang.Object obj7 = extendedMessageFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat627");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat628");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat629");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Locale locale9 = extendedMessageFormat7.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat630");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat631");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj4 = extendedMessageFormat1.parseObject("hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat632");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object obj4 = null;
        java.lang.String str5 = extendedMessageFormat2.format(obj4);
        java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat633");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void ExtendedMessageFormat634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat634");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.util.Locale locale9 = extendedMessageFormat7.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat635");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat636");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str6 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat637");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat638");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        boolean boolean7 = extendedMessageFormat5.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ExtendedMessageFormat639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat639");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat640");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat641");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.Object obj6 = extendedMessageFormat4.parseObject("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.Class<?> wildcardClass8 = formatArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat642");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat643");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat644");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat645");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        extendedMessageFormat1.setLocale(locale5);
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat646");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat647");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.Object obj6 = extendedMessageFormat4.parseObject("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat4.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat648");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format format7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) 0, format7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat649");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat6.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat650");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat651");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat652");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat653");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat4.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat654");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat655");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        java.lang.Object obj9 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat656");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat657");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat4.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat658");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void ExtendedMessageFormat659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat659");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        extendedMessageFormat1.setLocale(locale5);
        java.lang.Object obj7 = null;
        boolean boolean8 = extendedMessageFormat1.equals(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ExtendedMessageFormat660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat660");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object obj6 = null;
        java.lang.String str7 = extendedMessageFormat1.format(obj6);
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat661");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.Object obj6 = extendedMessageFormat4.parseObject("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        extendedMessageFormat4.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat662");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat663");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat5.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat664");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat665");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat666");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.lang.Object obj8 = extendedMessageFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat667");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat668");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat669");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat1.formatToCharacterIterator(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat670");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat671");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat672");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat673");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        java.lang.Class<?> wildcardClass9 = formatArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat674");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void ExtendedMessageFormat675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat675");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat676");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat677");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat678");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat679");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat5.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat680");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat681");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat682");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat683");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat684");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass9 = formatArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat685");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        extendedMessageFormat1.setLocale(locale7);
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void ExtendedMessageFormat686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat686");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat687");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat688");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray6 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat689");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        java.lang.String str6 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat690");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.Object obj5 = null;
        java.lang.String str6 = extendedMessageFormat1.format(obj5);
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat691");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.String str8 = extendedMessageFormat2.format((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat692");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        boolean boolean7 = extendedMessageFormat5.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat5.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ExtendedMessageFormat693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat693");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat694");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat695");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat696");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat697");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat698");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.lang.Class<?> wildcardClass7 = formatArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat699");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat700");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat701");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat702");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat703");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat704");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat705");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.lang.Class<?> wildcardClass9 = locale8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat706");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat707");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat708");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat709");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat710");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat711");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat712");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat713");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat714");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.util.Locale locale8 = extendedMessageFormat6.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat715");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat716");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat717");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat718");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat719");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat720");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat721");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat722");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat723");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat724");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat725");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat726");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat2.format(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat727");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat728");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.lang.Object obj9 = extendedMessageFormat6.parseObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat729");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat730");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat731");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat732");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat733");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat734");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat735");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat736");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat737");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
    }

    @Test
    public void ExtendedMessageFormat738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat738");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat739");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat740");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat741");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat742");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat743");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat744");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        boolean boolean7 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat5);
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat745");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat746");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat747");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat748");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat749");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat750");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.Class<?> wildcardClass7 = locale5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat751");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat752");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj3 = extendedMessageFormat1.parseObject("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.String str8 = extendedMessageFormat1.format((java.lang.Object) locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Locale cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat753");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat754");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat755");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat756");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat757");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat758");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void ExtendedMessageFormat759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat759");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat760");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat761");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat762");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat763");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.lang.Object obj6 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat764");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat765");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat766");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat4.parse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void ExtendedMessageFormat767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat767");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat6.applyPattern("hi!");
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat768");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object obj7 = extendedMessageFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat769");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat4.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat770");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.lang.Object obj8 = extendedMessageFormat7.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat771");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat772");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat773");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat774");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.lang.Object obj8 = extendedMessageFormat7.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat775");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat776");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat1.parse("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat777");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat778");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat779");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.Object obj5 = null;
        java.lang.String str6 = extendedMessageFormat1.format(obj5);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat780");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat781");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat782");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.Object obj6 = extendedMessageFormat4.parseObject("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        extendedMessageFormat4.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat783");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat784");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void ExtendedMessageFormat785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat785");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat786");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat787");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat788");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat789");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat790");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ExtendedMessageFormat791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat791");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat792");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat793");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat794");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat795");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat796");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.Object obj8 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat797");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.util.Locale locale6 = null;
        extendedMessageFormat5.setLocale(locale6);
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat798");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat799");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat800");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat801");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat802");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass7 = formatArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat803");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat804");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.lang.Object obj5 = extendedMessageFormat3.parseObject("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat805");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.util.Locale locale6 = null;
        extendedMessageFormat5.setLocale(locale6);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat806");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object obj7 = extendedMessageFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat807");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat808");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat809");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat810");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat6.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat811");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass6 = formatArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat812");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj3 = extendedMessageFormat1.parseObject("hi!");
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void ExtendedMessageFormat813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat813");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat6.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat814");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        extendedMessageFormat5.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat815");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        boolean boolean7 = extendedMessageFormat5.equals((java.lang.Object) 10L);
        extendedMessageFormat5.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ExtendedMessageFormat816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat816");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass6 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat817");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray3);
        java.lang.Class<?> wildcardClass5 = formatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ExtendedMessageFormat818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat818");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.Object obj9 = extendedMessageFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat819");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat820");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.Object obj6 = extendedMessageFormat4.parseObject("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat821");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat822");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat823");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat824");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat825");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat826");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        extendedMessageFormat1.setLocale(locale5);
        java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!");
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat827");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat828");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat5.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat829");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat830");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.Object obj5 = null;
        java.lang.String str6 = extendedMessageFormat1.format(obj5);
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat831");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat832");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat833");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        boolean boolean5 = extendedMessageFormat2.equals((java.lang.Object) (short) 10);
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 0);
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat834");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat835");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat836");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void ExtendedMessageFormat837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat837");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = extendedMessageFormat1.formatToCharacterIterator(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat838");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat839");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat840");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.util.Locale locale8 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat841");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat842");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat843");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray6 = extendedMessageFormat1.parse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void ExtendedMessageFormat844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat844");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat845");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        extendedMessageFormat1.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat846");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat847");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass8 = locale7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat848");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat849");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat850");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat851");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat852");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.Object obj9 = extendedMessageFormat7.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat853");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat854");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat6.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat855");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat856");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ExtendedMessageFormat857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat857");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void ExtendedMessageFormat858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat858");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.Object obj7 = extendedMessageFormat1.parseObject("hi!");
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat859");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean5 = extendedMessageFormat3.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.lang.Class<?> wildcardClass9 = locale6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat860");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat861");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat862");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat863");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat864");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat865");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat866");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat867");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat868");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat869");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat870");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat871");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat872");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.util.Locale locale7 = extendedMessageFormat5.getLocale();
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat873");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void ExtendedMessageFormat874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat874");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat875");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj7 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat876");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        java.text.Format[] formatArray7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat877");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat878");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat879");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        extendedMessageFormat1.applyPattern("");
        java.lang.Object obj6 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat880");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void ExtendedMessageFormat881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat881");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        boolean boolean5 = extendedMessageFormat3.equals((java.lang.Object) 10.0f);
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat882");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat883");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat884");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat885");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.lang.Object obj6 = null;
        boolean boolean7 = extendedMessageFormat2.equals(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ExtendedMessageFormat886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat886");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat887");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat888");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.lang.Object obj9 = extendedMessageFormat7.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat889");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat890");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat891");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat892");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean5 = extendedMessageFormat3.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat893");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat894");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj3 = extendedMessageFormat1.parseObject("hi!");
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void ExtendedMessageFormat895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat895");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat896");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat897");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ExtendedMessageFormat898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat898");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat1.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat899");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        extendedMessageFormat1.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void ExtendedMessageFormat900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat900");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void ExtendedMessageFormat901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat901");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat902");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat903");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat904");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat905");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat906");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat907");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat908");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat909");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void ExtendedMessageFormat910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat910");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object obj7 = extendedMessageFormat1.parseObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat911");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat912");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass7 = formatArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat913");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat914");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat915");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.Object obj8 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat916");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat917");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat918");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        extendedMessageFormat1.applyPattern("");
        java.lang.Class<?> wildcardClass6 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat919");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat920");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat921");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 1.0d);
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat922");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat923");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj7 = extendedMessageFormat1.parseObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat924");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat925");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj3 = extendedMessageFormat1.parseObject("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat926");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat927");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat928");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat929");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat930");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.util.Locale locale7 = extendedMessageFormat5.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat931");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat932");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale8 = null;
        extendedMessageFormat2.setLocale(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat933");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat1.setFormats(formatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void ExtendedMessageFormat934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat934");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat935");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat936");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void ExtendedMessageFormat937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat937");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat938");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat939");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat940");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat941");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj6 = null;
        boolean boolean7 = extendedMessageFormat1.equals(obj6);
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void ExtendedMessageFormat942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat942");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        boolean boolean7 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat5);
        java.text.Format[] formatArray8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ExtendedMessageFormat943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat943");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat1.parse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void ExtendedMessageFormat944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat944");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat945");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat946");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat947");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        boolean boolean8 = extendedMessageFormat1.equals((java.lang.Object) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ExtendedMessageFormat948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.ExtendedMessageFormat948");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 1.0d);
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }
}

