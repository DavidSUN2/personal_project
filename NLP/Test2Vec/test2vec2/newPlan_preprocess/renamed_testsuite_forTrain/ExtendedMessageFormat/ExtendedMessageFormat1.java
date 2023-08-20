
package ExtendedMessageFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExtendedMessageFormat1 {

    public static boolean debug = false;

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test501");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test502");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test503");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test504");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test505");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test506");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test507");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test508");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test509");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test510");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        extendedMessageFormat1.setLocale(locale5);
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test511");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test512");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test513");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test514");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test515");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test516");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test517");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test518");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test519");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test520");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test521");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test522");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test523");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test524");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test525");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test526");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test527");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test528");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test529");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test530");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test531");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test532");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test533");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test534");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test535");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.Object[] objArray6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test536");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test537");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test538");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test539");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test540");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test541");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test542");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test543");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test544");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test545");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test546");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) -1, (java.text.Format) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test547");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test548");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test549");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test550");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test551");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test552");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test553");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test554");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test555");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test556");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test557");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test558");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test559");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test560");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test561");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test562");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj3 = extendedMessageFormat1.parseObject("hi!");
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test563");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test564");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test565");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test566");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test567");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test568");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test569");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test570");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test571");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test572");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test573");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test574");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test575");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test576");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test577");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test578");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test579");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test580");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test581");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test582");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test583");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test584");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test585");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test586");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test587");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test588");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test589");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test590");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test591");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test592");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test593");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test594");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test595");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test596");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test597");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test598");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test599");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test600");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test601");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test602");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test603");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test604");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test605");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test606");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test607");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test608");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean8 = extendedMessageFormat6.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test609");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test610");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test611");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test612");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test613");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test614");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test615");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test616");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test617");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test618");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test619");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test620");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format format8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test621");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test622");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test623");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test624");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test625");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test626");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test627");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test628");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test629");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test630");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test631");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = extendedMessageFormat1.parseObject("hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test632");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test633");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test634");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test635");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test636");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test637");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test638");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        boolean boolean7 = extendedMessageFormat5.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test639");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test640");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test641");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test642");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test643");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test644");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test645");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test646");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test647");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.Object obj6 = extendedMessageFormat4.parseObject("hi!");
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test648");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format format7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test649");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test650");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test651");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test652");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test653");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test654");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test655");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test656");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test657");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test658");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test659");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test660");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test661");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test662");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test663");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test664");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test665");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test666");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test667");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test668");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test669");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test670");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test671");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test672");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test673");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test674");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test675");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test676");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test677");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test678");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test679");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test680");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test681");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test682");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test683");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test684");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test685");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test686");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test687");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test688");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test689");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test690");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test691");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test692");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        boolean boolean7 = extendedMessageFormat5.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test693");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test694");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test695");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test696");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test697");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test698");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test699");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test700");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test701");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test702");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test703");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test704");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test705");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test706");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test707");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test708");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test709");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test710");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test711");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test712");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test713");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test714");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test715");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test716");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test717");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test718");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test719");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test720");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test721");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test722");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test723");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test724");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test725");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test726");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test727");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test728");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test729");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test730");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test731");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test732");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test733");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test734");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test735");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test736");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test737");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test738");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test739");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test740");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test741");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test742");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test743");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test744");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test745");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test746");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test747");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test748");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test749");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test750");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test751");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test752");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj3 = extendedMessageFormat1.parseObject("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test753");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test754");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test755");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test756");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test757");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test758");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test759");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test760");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test761");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test762");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test763");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test764");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test765");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test766");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test767");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test768");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test769");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test770");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test771");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test772");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test773");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test774");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test775");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test776");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test777");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test778");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test779");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test780");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test781");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test782");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test783");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test784");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test785");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test786");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test787");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test788");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test789");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test790");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test791");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test792");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test793");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test794");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test795");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test796");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test797");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test798");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test799");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test800");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test801");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test802");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test803");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test804");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test805");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.util.Locale locale6 = null;
        extendedMessageFormat5.setLocale(locale6);
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test806");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test807");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test808");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test809");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test810");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test811");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test812");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj3 = extendedMessageFormat1.parseObject("hi!");
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test813");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test814");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test815");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test816");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test817");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test818");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test819");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test820");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test821");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test822");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test823");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test824");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test825");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test826");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test827");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test828");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test829");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test830");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test831");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test832");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test833");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test834");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test835");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test836");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test837");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test838");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test839");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test840");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test841");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test842");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test843");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test844");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test845");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test846");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test847");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test848");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test849");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test850");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test851");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test852");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test853");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test854");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test855");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test856");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test857");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test858");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test859");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test860");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test861");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test862");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test863");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test864");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test865");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test866");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test867");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test868");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test869");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test870");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test871");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test872");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test873");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test874");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test875");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test876");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        java.text.Format[] formatArray7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test877");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test878");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test879");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test880");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test881");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test882");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test883");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test884");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test885");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test886");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test887");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test888");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test889");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test890");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test891");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test892");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test893");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test894");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj3 = extendedMessageFormat1.parseObject("hi!");
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test895");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test896");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test897");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test898");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test899");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test900");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test901");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test902");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test903");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test904");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test905");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test906");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test907");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test908");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test909");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test910");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test911");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test912");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test913");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test914");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test915");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test916");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test917");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test918");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test919");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test920");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test921");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test922");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test923");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test924");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test925");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test926");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test927");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test928");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test929");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test930");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test931");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test932");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test933");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test934");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test935");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test936");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test937");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test938");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test939");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test940");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test941");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test942");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        boolean boolean7 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat5);
        java.text.Format[] formatArray8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test943");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test944");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test945");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test946");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test947");
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
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat1.test948");
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

