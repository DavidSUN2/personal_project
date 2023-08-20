package ExtendedMessageFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExtendedMessageFormat0 {

    public static boolean debug = false;

    @Test
    public void ExtendedMessageFormat001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat001");
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
    public void ExtendedMessageFormat002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat002");
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
    public void ExtendedMessageFormat003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat003");
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
    public void ExtendedMessageFormat004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat004");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray8 = new java.text.Format[] { extendedMessageFormat3, extendedMessageFormat5, extendedMessageFormat7 };
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat005");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = extendedMessageFormat1.format((java.lang.Object) (short) 10, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat006");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
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
    public void ExtendedMessageFormat007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat007");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat008");
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
    public void ExtendedMessageFormat009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat009");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat010");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.lang.Class<?> wildcardClass2 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ExtendedMessageFormat011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat011");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat012");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat013");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
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
    public void ExtendedMessageFormat014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat014");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray3 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat015");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat016");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat017");
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
    public void ExtendedMessageFormat018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat018");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
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
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat019");
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
    public void ExtendedMessageFormat020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat020");
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
    public void ExtendedMessageFormat021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat021");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat022");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat023");
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
    public void ExtendedMessageFormat024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat024");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj5 = extendedMessageFormat2.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat025");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat026");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat027");
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
    public void ExtendedMessageFormat028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat028");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat029");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = null;
        extendedMessageFormat3.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat030");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
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
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat031");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat032");
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
    public void ExtendedMessageFormat033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat033");
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
    public void ExtendedMessageFormat034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat034");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.Object obj4 = extendedMessageFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void ExtendedMessageFormat035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat035");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat036");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat037");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat038");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass3 = formatArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ExtendedMessageFormat039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat039");
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
    public void ExtendedMessageFormat040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat040");
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
    public void ExtendedMessageFormat041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat041");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat042");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat043");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat044");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void ExtendedMessageFormat045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat045");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat046");
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
    public void ExtendedMessageFormat047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat047");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat048");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat049");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat050");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat6.getClass();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat051");
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
    public void ExtendedMessageFormat052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat052");
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
    public void ExtendedMessageFormat053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat053");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat054");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat055");
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
    public void ExtendedMessageFormat056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat056");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat057");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format format7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex(10, format7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat058");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat059");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat060");
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
    public void ExtendedMessageFormat061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat061");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat062");
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
    public void ExtendedMessageFormat063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat063");
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
    public void ExtendedMessageFormat064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat064");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat065");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat066");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat067");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat068");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat069");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat070");
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
    public void ExtendedMessageFormat071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat071");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat072");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat073");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat074");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat075");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat076");
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
    public void ExtendedMessageFormat077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat077");
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
    public void ExtendedMessageFormat078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat078");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.Object obj8 = extendedMessageFormat6.parseObject("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat079");
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
    public void ExtendedMessageFormat080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat080");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat081");
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
    public void ExtendedMessageFormat082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat082");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat083");
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
    public void ExtendedMessageFormat084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat084");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat085");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat086");
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
    public void ExtendedMessageFormat087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat087");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format format5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat088");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat089");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat090");
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
    public void ExtendedMessageFormat091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat091");
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
    public void ExtendedMessageFormat092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat092");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat093");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            extendedMessageFormat1.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat094");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
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
    public void ExtendedMessageFormat095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat095");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat096");
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
    public void ExtendedMessageFormat097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat097");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat098");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat099");
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
    public void ExtendedMessageFormat100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat100");
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
    public void ExtendedMessageFormat101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat101");
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
    public void ExtendedMessageFormat102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat102");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat103");
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
    public void ExtendedMessageFormat104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat104");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = extendedMessageFormat1.equals((java.lang.Object) 0);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat105");
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
    public void ExtendedMessageFormat106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat106");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat107");
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
    public void ExtendedMessageFormat108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat108");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat109");
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
    public void ExtendedMessageFormat110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat110");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat111");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat112");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat113");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        extendedMessageFormat1.setLocale(locale5);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat114");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format format8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat115");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat116");
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
    public void ExtendedMessageFormat117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat117");
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
    public void ExtendedMessageFormat118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat118");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Class<?> wildcardClass2 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ExtendedMessageFormat119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat119");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat120");
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
    public void ExtendedMessageFormat121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat121");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        extendedMessageFormat1.applyPattern("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat122");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat123");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat124");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat125");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat126");
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
    public void ExtendedMessageFormat127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat127");
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
    public void ExtendedMessageFormat128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat128");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object obj4 = extendedMessageFormat2.parseObject("hi!");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat129");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat130");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat131");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat132");
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
    public void ExtendedMessageFormat133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat133");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat134");
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
    public void ExtendedMessageFormat135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat135");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat136");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat137");
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
    public void ExtendedMessageFormat138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat138");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat139");
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
    public void ExtendedMessageFormat140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat140");
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
    public void ExtendedMessageFormat141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat141");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat142");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat143");
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
    public void ExtendedMessageFormat144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat144");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat145");
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
    public void ExtendedMessageFormat146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat146");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat147");
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
    public void ExtendedMessageFormat148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat148");
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
    public void ExtendedMessageFormat149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat149");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format format7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat150");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat151");
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
    public void ExtendedMessageFormat152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat152");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat153");
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
    public void ExtendedMessageFormat154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat154");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat155");
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
    public void ExtendedMessageFormat156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat156");
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
    public void ExtendedMessageFormat157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat157");
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
    public void ExtendedMessageFormat158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat158");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat159");
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
    public void ExtendedMessageFormat160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat160");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat161");
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
    public void ExtendedMessageFormat162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat162");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat163");
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
    public void ExtendedMessageFormat164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat164");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat165");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat166");
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
    public void ExtendedMessageFormat167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat167");
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
    public void ExtendedMessageFormat168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat168");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat169");
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
    public void ExtendedMessageFormat170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat170");
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
    public void ExtendedMessageFormat171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat171");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat5.format(obj7);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat172");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Locale locale7 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat173");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat174");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
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
    public void ExtendedMessageFormat175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat175");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat176");
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
    public void ExtendedMessageFormat177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat177");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat178");
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
    public void ExtendedMessageFormat179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat179");
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
    public void ExtendedMessageFormat180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat180");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat181");
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
    public void ExtendedMessageFormat182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat182");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat183");
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
    public void ExtendedMessageFormat184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat184");
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
    public void ExtendedMessageFormat185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat185");
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
    public void ExtendedMessageFormat186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat186");
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
    public void ExtendedMessageFormat187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat187");
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
    public void ExtendedMessageFormat188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat188");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat189");
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
    public void ExtendedMessageFormat190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat190");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat191");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat192");
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
    public void ExtendedMessageFormat193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat193");
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
    public void ExtendedMessageFormat194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat194");
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
    public void ExtendedMessageFormat195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat195");
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
    public void ExtendedMessageFormat196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat196");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat197");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat198");
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
    public void ExtendedMessageFormat199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat199");
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
    public void ExtendedMessageFormat200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat200");
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
    public void ExtendedMessageFormat201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat201");
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
    public void ExtendedMessageFormat202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat202");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat203");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat204");
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
    public void ExtendedMessageFormat205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat205");
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
    public void ExtendedMessageFormat206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat206");
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
    public void ExtendedMessageFormat207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat207");
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
    public void ExtendedMessageFormat208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat208");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat209");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Object obj6 = null;
        java.lang.String str7 = extendedMessageFormat1.format(obj6);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat210");
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
    public void ExtendedMessageFormat211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat211");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat212");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat213");
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
    public void ExtendedMessageFormat214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat214");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat215");
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
    public void ExtendedMessageFormat216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat216");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format format7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat217");
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
    public void ExtendedMessageFormat218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat218");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat219");
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
    public void ExtendedMessageFormat220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat220");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat221");
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
    public void ExtendedMessageFormat222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat222");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format format5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat223");
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
    public void ExtendedMessageFormat224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat224");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat225");
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
    public void ExtendedMessageFormat226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat226");
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
    public void ExtendedMessageFormat227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat227");
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
    public void ExtendedMessageFormat228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat228");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat229");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat230");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat231");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat232");
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
    public void ExtendedMessageFormat233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat233");
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
    public void ExtendedMessageFormat234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat234");
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
    public void ExtendedMessageFormat235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat235");
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
    public void ExtendedMessageFormat236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat236");
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
    public void ExtendedMessageFormat237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat237");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat238");
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
    public void ExtendedMessageFormat239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat239");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat240");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat241");
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
    public void ExtendedMessageFormat242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat242");
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
    public void ExtendedMessageFormat243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat243");
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
    public void ExtendedMessageFormat244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat244");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
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
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat245");
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
    public void ExtendedMessageFormat246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat246");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj3 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat247");
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
    public void ExtendedMessageFormat248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat248");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat249");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat250");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat251");
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
    public void ExtendedMessageFormat252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat252");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void ExtendedMessageFormat253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat253");
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
    public void ExtendedMessageFormat254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat254");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat255");
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
    public void ExtendedMessageFormat256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat256");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat257");
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
    public void ExtendedMessageFormat258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat258");
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
    public void ExtendedMessageFormat259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat259");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat260");
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
    public void ExtendedMessageFormat261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat261");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat262");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
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
    public void ExtendedMessageFormat263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat263");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat264");
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
    public void ExtendedMessageFormat265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat265");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat266");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat267");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat268");
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
    public void ExtendedMessageFormat269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat269");
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
    public void ExtendedMessageFormat270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat270");
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
    public void ExtendedMessageFormat271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat271");
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
    public void ExtendedMessageFormat272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat272");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass3 = extendedMessageFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ExtendedMessageFormat273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat273");
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
    public void ExtendedMessageFormat274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat274");
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
    public void ExtendedMessageFormat275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat275");
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
    public void ExtendedMessageFormat276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat276");
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
    public void ExtendedMessageFormat277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat277");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat278");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat279");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat280");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat281");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        extendedMessageFormat1.applyPattern("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat282");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat283");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat284");
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
    public void ExtendedMessageFormat285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat285");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format format6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat286");
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
    public void ExtendedMessageFormat287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat287");
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
    public void ExtendedMessageFormat288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat288");
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
    public void ExtendedMessageFormat289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat289");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat290");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat291");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
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
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void ExtendedMessageFormat292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat292");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = java.text.MessageFormat.format("hi!", objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void ExtendedMessageFormat293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat293");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat294");
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
    public void ExtendedMessageFormat295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat295");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat296");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat297");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat298");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat299");
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
    public void ExtendedMessageFormat300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat300");
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
    public void ExtendedMessageFormat301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat301");
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
    public void ExtendedMessageFormat302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat302");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat303");
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
    public void ExtendedMessageFormat304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat304");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat305");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object obj5 = extendedMessageFormat2.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat306");
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
    public void ExtendedMessageFormat307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat307");
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
    public void ExtendedMessageFormat308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat308");
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
    public void ExtendedMessageFormat309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat309");
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
    public void ExtendedMessageFormat310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat310");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat311");
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
    public void ExtendedMessageFormat312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat312");
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
    public void ExtendedMessageFormat313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat313");
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
    public void ExtendedMessageFormat314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat314");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat315");
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
    public void ExtendedMessageFormat316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat316");
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
    public void ExtendedMessageFormat317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat317");
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
    public void ExtendedMessageFormat318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat318");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat319");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean4 = extendedMessageFormat1.equals((java.lang.Object) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ExtendedMessageFormat320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat320");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat321");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat322");
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
    public void ExtendedMessageFormat323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat323");
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
    public void ExtendedMessageFormat324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat324");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat325");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat326");
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
    public void ExtendedMessageFormat327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat327");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat328");
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
    public void ExtendedMessageFormat329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat329");
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
    public void ExtendedMessageFormat330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat330");
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
    public void ExtendedMessageFormat331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat331");
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
    public void ExtendedMessageFormat332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat332");
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
    public void ExtendedMessageFormat333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat333");
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
    public void ExtendedMessageFormat334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat334");
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
    public void ExtendedMessageFormat335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat335");
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
    public void ExtendedMessageFormat336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat336");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat337");
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
    public void ExtendedMessageFormat338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat338");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat339");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ExtendedMessageFormat340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat340");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat341");
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
    public void ExtendedMessageFormat342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat342");
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
    public void ExtendedMessageFormat343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat343");
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
    public void ExtendedMessageFormat344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat344");
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
    public void ExtendedMessageFormat345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat345");
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
    public void ExtendedMessageFormat346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat346");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat347");
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
    public void ExtendedMessageFormat348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat348");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat349");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat350");
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
    public void ExtendedMessageFormat351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat351");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat352");
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
    public void ExtendedMessageFormat353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat353");
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
    public void ExtendedMessageFormat354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat354");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat355");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat356");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void ExtendedMessageFormat357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat357");
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
    public void ExtendedMessageFormat358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat358");
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
    public void ExtendedMessageFormat359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat359");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat360");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat361");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
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
    public void ExtendedMessageFormat362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat362");
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
    public void ExtendedMessageFormat363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat363");
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
    public void ExtendedMessageFormat364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat364");
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
    public void ExtendedMessageFormat365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat365");
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
    public void ExtendedMessageFormat366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat366");
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
    public void ExtendedMessageFormat367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat367");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat368");
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
    public void ExtendedMessageFormat369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat369");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat370");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat371");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat372");
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
    public void ExtendedMessageFormat373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat373");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat374");
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
    public void ExtendedMessageFormat375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat375");
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
    public void ExtendedMessageFormat376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat376");
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
    public void ExtendedMessageFormat377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat377");
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
    public void ExtendedMessageFormat378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat378");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ExtendedMessageFormat379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat379");
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
    public void ExtendedMessageFormat380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat380");
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
    public void ExtendedMessageFormat381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat381");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat382");
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
    public void ExtendedMessageFormat383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat383");
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
    public void ExtendedMessageFormat384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat384");
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
    public void ExtendedMessageFormat385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat385");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = java.text.MessageFormat.format("", objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void ExtendedMessageFormat386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat386");
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
    public void ExtendedMessageFormat387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat387");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat388");
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
    public void ExtendedMessageFormat389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat389");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat390");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
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
        org.junit.Assert.assertNotNull(formatArray7);
    }

    @Test
    public void ExtendedMessageFormat391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat391");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str3 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void ExtendedMessageFormat392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat392");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat393");
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
    public void ExtendedMessageFormat394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat394");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.text.Format format8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat395");
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
    public void ExtendedMessageFormat396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat396");
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
    public void ExtendedMessageFormat397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat397");
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
    public void ExtendedMessageFormat398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat398");
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
    public void ExtendedMessageFormat399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat399");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat400");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat401");
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
    public void ExtendedMessageFormat402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat402");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat403");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat404");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat405");
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
    public void ExtendedMessageFormat406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat406");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat407");
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
    public void ExtendedMessageFormat408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat408");
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
    public void ExtendedMessageFormat409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat409");
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
    public void ExtendedMessageFormat410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat410");
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
    public void ExtendedMessageFormat411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat411");
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
    public void ExtendedMessageFormat412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat412");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat413");
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
    public void ExtendedMessageFormat414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat414");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
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
    public void ExtendedMessageFormat415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat415");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat416");
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
    public void ExtendedMessageFormat417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat417");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat418");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat419");
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
    public void ExtendedMessageFormat420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat420");
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
    public void ExtendedMessageFormat421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat421");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat422");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat423");
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
    public void ExtendedMessageFormat424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat424");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat425");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat426");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExtendedMessageFormat427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat427");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat428");
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
    public void ExtendedMessageFormat429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat429");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat430");
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
    public void ExtendedMessageFormat431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat431");
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
    public void ExtendedMessageFormat432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat432");
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
    public void ExtendedMessageFormat433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat433");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ExtendedMessageFormat434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat434");
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
    public void ExtendedMessageFormat435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat435");
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
    public void ExtendedMessageFormat436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat436");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray5);
    }

    @Test
    public void ExtendedMessageFormat437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat437");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat438");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        boolean boolean7 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat5);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat439");
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
    public void ExtendedMessageFormat440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat440");
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
    public void ExtendedMessageFormat441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat441");
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
    public void ExtendedMessageFormat442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat442");
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
    public void ExtendedMessageFormat443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat443");
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
    public void ExtendedMessageFormat444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat444");
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
    public void ExtendedMessageFormat445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat445");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
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
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void ExtendedMessageFormat446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat446");
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
    public void ExtendedMessageFormat447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat447");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!");
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
        org.junit.Assert.assertNotNull(formatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void ExtendedMessageFormat448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat448");
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
    public void ExtendedMessageFormat449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat449");
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
    public void ExtendedMessageFormat450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat450");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat451");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void ExtendedMessageFormat452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat452");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat453");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat454");
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
    public void ExtendedMessageFormat455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat455");
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
    public void ExtendedMessageFormat456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat456");
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
    public void ExtendedMessageFormat457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat457");
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
    public void ExtendedMessageFormat458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat458");
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
    public void ExtendedMessageFormat459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat459");
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
    public void ExtendedMessageFormat460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat460");
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
    public void ExtendedMessageFormat461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat461");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void ExtendedMessageFormat462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat462");
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
    public void ExtendedMessageFormat463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat463");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat464");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(formatArray3);
    }

    @Test
    public void ExtendedMessageFormat465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat465");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat466");
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
    public void ExtendedMessageFormat467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat467");
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
    public void ExtendedMessageFormat468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat468");
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
    public void ExtendedMessageFormat469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat469");
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
    public void ExtendedMessageFormat470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat470");
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
    public void ExtendedMessageFormat471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat471");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat472");
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
    public void ExtendedMessageFormat473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat473");
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
    public void ExtendedMessageFormat474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat474");
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
    public void ExtendedMessageFormat475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat475");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat476");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat477");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat478");
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
    public void ExtendedMessageFormat479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat479");
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
    public void ExtendedMessageFormat480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat480");
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
    public void ExtendedMessageFormat481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat481");
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
    public void ExtendedMessageFormat482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat482");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat483");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat484");
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
    public void ExtendedMessageFormat485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat485");
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
    public void ExtendedMessageFormat486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat486");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat487");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void ExtendedMessageFormat488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat488");
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
    public void ExtendedMessageFormat489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat489");
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
    public void ExtendedMessageFormat490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat490");
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
    public void ExtendedMessageFormat491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat491");
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
    public void ExtendedMessageFormat492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat492");
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
    public void ExtendedMessageFormat493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat493");
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
    public void ExtendedMessageFormat494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat494");
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
    public void ExtendedMessageFormat495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat495");
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
    public void ExtendedMessageFormat496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat496");
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
    public void ExtendedMessageFormat497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat497");
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
    public void ExtendedMessageFormat498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat498");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray4 = null;
        // The following exception was thrown during execution in ExtendedMessageFormat generation
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
    public void ExtendedMessageFormat499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat499");
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
    public void ExtendedMessageFormat500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedMessageFormat0.ExtendedMessageFormat500");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
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
        org.junit.Assert.assertNotNull(formatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }
}

