
package ExtendedMessageFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExtendedMessageFormat0 {

    public static boolean debug = false;

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test001");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, (-1L), (-1) };
        java.lang.String str6 = java.text.MessageFormat.format("hi!", objArray5);
        java.lang.String str7 = java.text.MessageFormat.format("", objArray5);
        java.lang.Class<?> wildcardClass8 = objArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test002");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, (-1L), (-1) };
        java.lang.String str5 = java.text.MessageFormat.format("hi!", objArray4);
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test003");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (-1L), (-1) };
        java.lang.String str7 = java.text.MessageFormat.format("hi!", objArray6);
        java.lang.String str8 = java.text.MessageFormat.format("", objArray6);
        java.lang.String str9 = java.text.MessageFormat.format("hi!", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test004");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray8 = new java.text.Format[] { extendedMessageFormat3, extendedMessageFormat5, extendedMessageFormat7 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test005");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = extendedMessageFormat1.format((java.lang.Object) (short) 10, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test006");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test007");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test008");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test009");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test010");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.lang.Class<?> wildcardClass2 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test011");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test012");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test013");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test014");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray3 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test015");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test016");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test017");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test018");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
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
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test019");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass4 = locale3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test020");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.Object obj7 = extendedMessageFormat1.clone();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test021");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test022");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test023");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = null;
        extendedMessageFormat3.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) formatArray8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test024");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat2.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test025");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test026");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test027");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj7 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test028");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test029");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = null;
        extendedMessageFormat3.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test030");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
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
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test031");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test032");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test033");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray4);
        java.lang.Class<?> wildcardClass6 = formatArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test034");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.Object obj4 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test035");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test036");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = extendedMessageFormat1.format((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test037");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat(100, (java.text.Format) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test038");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass3 = formatArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test039");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (-1L), (-1) };
        java.lang.String str7 = java.text.MessageFormat.format("hi!", objArray6);
        java.lang.String str8 = java.text.MessageFormat.format("", objArray6);
        java.lang.String str9 = java.text.MessageFormat.format("", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test040");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test041");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test042");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("hi!", parsePosition5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test043");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) str8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test044");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test045");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray4 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test046");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.Class<?> wildcardClass6 = extendedMessageFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test047");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test048");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test049");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test050");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedMessageFormat2.format((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test051");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object obj8 = extendedMessageFormat7.clone();
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
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test052");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        boolean boolean9 = extendedMessageFormat1.equals((java.lang.Object) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test053");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test054");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = extendedMessageFormat1.format((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test055");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test056");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat5.parseObject("hi!", parsePosition8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test057");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format format7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex(10, format7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test058");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = extendedMessageFormat2.format((java.lang.Object) true, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test059");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat4.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test060");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        extendedMessageFormat1.setLocale(locale7);
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test061");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test062");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        extendedMessageFormat1.setLocale(locale7);
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test063");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test064");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) '#', (java.text.Format) extendedMessageFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test065");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test066");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test067");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test068");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (byte) 100, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test069");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = extendedMessageFormat1.format((java.lang.Object) "", stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test070");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object obj6 = extendedMessageFormat1.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test071");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test072");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test073");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test074");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test075");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat6.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test076");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test077");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test078");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.Object obj8 = extendedMessageFormat6.parseObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test079");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test080");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test081");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test082");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test083");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass4 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test084");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test085");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat6.parseObject("hi!", parsePosition8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test086");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass8 = formatArray7.getClass();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test087");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format format5 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 0, format5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test088");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test089");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test090");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test091");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test092");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex(10, (java.text.Format) extendedMessageFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test093");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test094");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test095");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test096");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test097");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test098");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat7.format((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test099");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Object obj8 = null;
        java.lang.String str9 = extendedMessageFormat1.format(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test100");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.Object obj7 = extendedMessageFormat1.clone();
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
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test101");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test102");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test103");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test104");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test105");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        boolean boolean8 = extendedMessageFormat1.equals((java.lang.Object) (-1L));
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test106");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = extendedMessageFormat1.format((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test107");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj4 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test108");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test109");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test110");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test111");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test112");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = extendedMessageFormat1.format((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test113");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        extendedMessageFormat1.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test114");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format format8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (short) 1, format8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test115");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat6.parseObject("", parsePosition8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test116");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test117");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test118");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Class<?> wildcardClass2 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test119");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test120");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test121");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        extendedMessageFormat1.applyPattern("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!", parsePosition8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test122");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat6.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test123");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test124");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test125");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test126");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object obj5 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test127");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object obj7 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test128");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test129");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("", parsePosition4);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test130");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test131");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test132");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str6 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test133");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat5.format((java.lang.Object) 1L, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test134");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass4 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test135");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test136");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("hi!", parsePosition5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test137");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test138");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test139");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.Object obj4 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test140");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.Object obj5 = extendedMessageFormat1.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test141");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat5.parse("hi!", parsePosition8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test142");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test143");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass4 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test144");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("hi!");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test145");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str6 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test146");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test147");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test148");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        extendedMessageFormat1.setLocale(locale5);
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
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
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test149");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format format7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormat((int) (byte) 10, format7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test150");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (short) 100, (java.text.Format) extendedMessageFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test151");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.lang.Object obj5 = extendedMessageFormat2.clone();
        java.lang.Class<?> wildcardClass6 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test152");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat6.formatToCharacterIterator(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test153");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
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
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test154");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test155");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test156");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test157");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat5.getLocale();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        extendedMessageFormat1.setLocale(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test158");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat7.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test159");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.Object obj6 = extendedMessageFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test160");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("", parsePosition5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test161");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test162");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test163");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test164");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (byte) -1, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test165");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test166");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test167");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object obj5 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test168");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!", parsePosition6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test169");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        boolean boolean8 = extendedMessageFormat1.equals((java.lang.Object) (-1L));
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test170");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test171");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat5.format(obj7);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(0, (java.text.Format) extendedMessageFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test172");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Locale locale7 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test173");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test174");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test175");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test176");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test177");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test178");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.Object obj8 = null;
        java.lang.String str9 = extendedMessageFormat7.format(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test179");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass4 = formatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test180");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test181");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test182");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test183");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test184");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test185");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.lang.Object obj4 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test186");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.Object obj9 = extendedMessageFormat4.parseObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test187");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test188");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test189");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test190");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test191");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test192");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object obj6 = null;
        java.lang.String str7 = extendedMessageFormat1.format(obj6);
        extendedMessageFormat1.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test193");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        boolean boolean8 = extendedMessageFormat2.equals((java.lang.Object) "hi!");
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test194");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        boolean boolean5 = extendedMessageFormat2.equals((java.lang.Object) (short) 10);
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 0);
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test195");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        java.lang.Object[] objArray9 = extendedMessageFormat5.parse("hi!");
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
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test196");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test197");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test198");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test199");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        extendedMessageFormat1.setLocale(locale5);
        extendedMessageFormat1.applyPattern("");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test200");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
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
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test201");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test202");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test203");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test204");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        java.lang.Class<?> wildcardClass9 = locale7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test205");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test206");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj7 = extendedMessageFormat1.clone();
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
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test207");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
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
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test208");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!", parsePosition6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test209");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object obj6 = null;
        java.lang.String str7 = extendedMessageFormat1.format(obj6);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test210");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
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
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test211");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test212");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("", parsePosition7);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test213");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test214");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test215");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test216");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format format7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(0, format7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test217");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean8 = extendedMessageFormat6.equals((java.lang.Object) (byte) 10);
        boolean boolean9 = extendedMessageFormat2.equals((java.lang.Object) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test218");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat5.parseObject("");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test219");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        extendedMessageFormat2.setLocale(locale6);
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test220");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (short) 10, (java.text.Format) extendedMessageFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test221");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test222");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format format5 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) 10, format5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test223");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test224");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat5.parse("hi!", parsePosition8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test225");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        boolean boolean5 = extendedMessageFormat2.equals((java.lang.Object) (short) 10);
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 0);
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test226");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.lang.Object obj7 = extendedMessageFormat1.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test227");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test228");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test229");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test230");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test231");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test232");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass7 = formatArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test233");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray4);
        java.lang.Class<?> wildcardClass6 = formatArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test234");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        boolean boolean8 = extendedMessageFormat2.equals((java.lang.Object) "hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test235");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        boolean boolean5 = extendedMessageFormat2.equals((java.lang.Object) (short) 10);
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 0);
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test236");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test237");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test238");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test239");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test240");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!", parsePosition8);
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
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test241");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test242");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test243");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
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
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test244");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
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
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test245");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test246");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test247");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test248");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat6.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test249");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = extendedMessageFormat2.format((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test250");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test251");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test252");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test253");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test254");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("", parsePosition8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test255");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test256");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat5.parseObject("", parsePosition8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test257");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test258");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test259");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test260");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
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
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test261");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test262");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test263");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test264");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        boolean boolean9 = extendedMessageFormat1.equals((java.lang.Object) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test265");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test266");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat1.parse("", parsePosition5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test267");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test268");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test269");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test270");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.Class<?> wildcardClass6 = locale4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test271");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test272");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass3 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test273");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test274");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test275");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test276");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test277");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test278");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat7.formatToCharacterIterator(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test279");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test280");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test281");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test282");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
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
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test283");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!", parsePosition8);
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
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test284");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.Object obj9 = extendedMessageFormat7.clone();
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
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test285");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format format6 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 1, format6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test286");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.lang.Object obj5 = extendedMessageFormat3.parseObject("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test287");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat1.format(obj7);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test288");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.util.Locale locale8 = null;
        extendedMessageFormat7.setLocale(locale8);
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test289");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test290");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test291");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
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
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test292");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = java.text.MessageFormat.format("hi!", objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test293");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test294");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test295");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test296");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedMessageFormat1.format((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test297");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test298");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test299");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test300");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj4 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test301");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test302");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test303");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test304");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("", parsePosition6);
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
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test305");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat2.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test306");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test307");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test308");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test309");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormats();
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray6);
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test310");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test311");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test312");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test313");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object obj4 = null;
        java.lang.String str5 = extendedMessageFormat2.format(obj4);
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test314");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test315");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test316");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test317");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.Object obj8 = null;
        java.lang.String str9 = extendedMessageFormat2.format(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test318");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test319");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test320");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat5.parse("", parsePosition8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test321");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = extendedMessageFormat4.formatToCharacterIterator((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test322");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test323");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.Object obj7 = extendedMessageFormat1.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test324");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat5.parseObject("", parsePosition8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test325");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = extendedMessageFormat1.format(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test326");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        boolean boolean8 = extendedMessageFormat1.equals((java.lang.Object) (-1L));
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test327");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (byte) 10, (java.text.Format) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test328");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, (-1L), (-1) };
        java.lang.String str6 = java.text.MessageFormat.format("hi!", objArray5);
        java.lang.String str7 = java.text.MessageFormat.format("hi!", objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test329");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test330");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
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
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test331");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test332");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test333");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test334");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test335");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test336");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test337");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj6 = null;
        boolean boolean7 = extendedMessageFormat1.equals(obj6);
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test338");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test339");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test340");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("", parsePosition5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test341");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test342");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Object obj8 = null;
        java.lang.String str9 = extendedMessageFormat1.format(obj8);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test343");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj6 = null;
        boolean boolean7 = extendedMessageFormat1.equals(obj6);
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test344");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str6 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test345");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.lang.Object obj8 = extendedMessageFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test346");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test347");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass9 = locale8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test348");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!", parsePosition8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test349");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat1.parse("hi!", parsePosition5);
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test350");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test351");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test352");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.lang.Object obj9 = extendedMessageFormat8.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test353");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test354");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat5.parseObject("hi!");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test355");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test356");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test357");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test358");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test359");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat5.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test360");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test361");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test362");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test363");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass6 = formatArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test364");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat1.getClass();
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
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test365");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        extendedMessageFormat2.setLocale(locale6);
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test366");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test367");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test368");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test369");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test370");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test371");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test372");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormats();
        java.lang.String str6 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        java.lang.String str7 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        java.lang.Class<?> wildcardClass8 = formatArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test373");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test374");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat6.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test375");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.Object[] objArray7 = extendedMessageFormat5.parse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test376");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test377");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test378");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test379");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        extendedMessageFormat1.setLocale(locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test380");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        java.lang.Object obj8 = extendedMessageFormat5.clone();
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
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test381");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test382");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test383");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test384");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test385");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = java.text.MessageFormat.format("", objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test386");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test387");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test388");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test389");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test390");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
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
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test391");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test392");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test393");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test394");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.text.Format format8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex(100, format8);
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test395");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat6.format(obj7);
        java.lang.String str9 = extendedMessageFormat6.toPattern();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test396");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test397");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test398");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.lang.Class<?> wildcardClass5 = locale3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test399");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test400");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray8);
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
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test401");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object obj9 = extendedMessageFormat1.clone();
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
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test402");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test403");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test404");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test405");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.lang.Object obj4 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test406");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test407");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test408");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.Object obj9 = extendedMessageFormat7.parseObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test409");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test410");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test411");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.util.Locale locale8 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormats();
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test412");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray4 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test413");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test414");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test415");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test416");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test417");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test418");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test419");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test420");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass9 = locale8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test421");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray5);
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test422");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test423");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object obj4 = null;
        java.lang.String str5 = extendedMessageFormat2.format(obj4);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test424");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test425");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test426");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test427");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test428");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test429");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat5.parse("", parsePosition7);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test430");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.Object obj6 = extendedMessageFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test431");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test432");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object obj5 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test433");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test434");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.lang.Object obj9 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test435");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test436");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test437");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test438");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        boolean boolean7 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test439");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        java.lang.Class<?> wildcardClass9 = formatArray7.getClass();
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
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test440");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test441");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test442");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test443");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test444");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.lang.Object obj7 = extendedMessageFormat1.clone();
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
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test445");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
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
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test446");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        extendedMessageFormat4.applyPattern("hi!");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test447");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
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
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test448");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test449");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test450");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test451");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test452");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test453");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test454");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object obj4 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test455");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test456");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) "");
        java.lang.Object obj7 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test457");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test458");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.lang.Class<?> wildcardClass9 = locale8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test459");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean5 = extendedMessageFormat3.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test460");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.lang.Object obj5 = extendedMessageFormat2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test461");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test462");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        boolean boolean7 = extendedMessageFormat5.equals((java.lang.Object) 10L);
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test463");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test464");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test465");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test466");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!");
        java.lang.Object obj9 = extendedMessageFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test467");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test468");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray8);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test469");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test470");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test471");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("", parsePosition5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test472");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test473");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test474");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj6 = null;
        boolean boolean7 = extendedMessageFormat1.equals(obj6);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test475");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test476");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("hi!", parsePosition5);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test477");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!", parsePosition6);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test478");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test479");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test480");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test481");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
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
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test482");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat7.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test483");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat5.parseObject("", parsePosition8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test484");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test485");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.Object obj5 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test486");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test487");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test488");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        extendedMessageFormat7.applyPattern("hi!");
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test489");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test490");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test491");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.lang.Object obj7 = extendedMessageFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test492");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str8 = extendedMessageFormat1.toPattern();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test493");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray9);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test494");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
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
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test495");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass5 = formatArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test496");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test497");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.lang.Object obj6 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test498");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test499");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object obj7 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ExtendedMessageFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.test500");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }
}

