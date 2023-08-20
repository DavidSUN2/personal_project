package CompositeFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompositeFormat0 {

    public static boolean debug = false;

    @Test
    public void CompositeFormat001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat001");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str4 = compositeFormat2.format((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat002");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str4 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat003");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj4 = compositeFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat004");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj4 = compositeFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat005");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Class<?> wildcardClass3 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CompositeFormat006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat006");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat4.format(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat007");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.format((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat008");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = compositeFormat4.format((java.lang.Object) 100.0f, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat009");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = compositeFormat4.format((java.lang.Object) 0.0f, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat010");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat011");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat012");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = compositeFormat4.format((java.lang.Object) (byte) 0, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat013");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat014");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = format6.formatToCharacterIterator((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat015");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat016");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass6 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompositeFormat017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat017");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat018");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass7 = format6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat019");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat020");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = compositeFormat2.formatToCharacterIterator((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat021");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat4.format((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat022");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass6 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompositeFormat023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat023");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat024");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat025");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass6 = format5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat026");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = null;
        java.text.Format format7 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat8 = new org.apache.commons.lang3.text.CompositeFormat(format6, format7);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat(format5, format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat027");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str4 = compositeFormat2.format((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat028");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat029");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat030");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat031");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str4 = compositeFormat2.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat032");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = format6.format((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat033");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat034");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat035");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat4.formatToCharacterIterator((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat036");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat037");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat038");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat039");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat040");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat041");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat042");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = format5.formatToCharacterIterator((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat043");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat044");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Class<?> wildcardClass8 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat045");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompositeFormat046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat046");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str4 = compositeFormat2.format((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat047");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat048");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat4, format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat049");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat050");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat051");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = compositeFormat4.format((java.lang.Object) (-1.0d), stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat052");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass8 = format7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat053");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat054");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat055");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat056");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat057");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat058");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat059");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat060");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat061");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat062");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat063");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat4.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat064");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat065");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat066");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat067");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat4.format((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat068");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat069");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat070");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat071");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.format((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat072");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat073");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat074");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = compositeFormat4.format((java.lang.Object) (short) 0, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat075");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat076");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass6 = format5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat077");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat078");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat079");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat080");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = compositeFormat4.format((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat081");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.format((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat082");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat083");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat084");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat085");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat086");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat087");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat088");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat089");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat090");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat091");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass8 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat092");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat093");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat094");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat095");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat096");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat097");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.format((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat098");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat099");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat100");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat101");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat102");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat103");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat104");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat105");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat106");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat107");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat108");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format7.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat109");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat110");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat111");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str5 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat112");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat113");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat4.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat114");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat115");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = compositeFormat4.formatToCharacterIterator((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat116");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat117");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = format5.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat118");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat119");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = compositeFormat4.formatToCharacterIterator((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat120");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = compositeFormat2.format((java.lang.Object) 0.0f, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat121");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat122");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = compositeFormat2.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat123");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.format((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat124");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat125");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat126");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Class<?> wildcardClass5 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompositeFormat127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat127");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat128");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat129");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat130");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = compositeFormat2.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat131");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat132");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat133");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat134");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat135");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass8 = format7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat136");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat137");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat138");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat139");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat140");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat141");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.format(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat142");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass7 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat143");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat144");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat145");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat146");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat147");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat148");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat149");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = compositeFormat4.formatToCharacterIterator((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat150");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat5.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat151");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.lang.Object obj4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = compositeFormat2.format(obj4, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat152");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat153");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = format6.format((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat154");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat155");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat4.formatToCharacterIterator(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat156");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass7 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat157");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat5.formatToCharacterIterator((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat158");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass7 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat159");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat160");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat5.formatToCharacterIterator((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat161");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat5.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat162");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat163");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass7 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat164");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat165");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat166");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat167");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat168");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass8 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat169");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj5 = format3.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat170");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat171");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = format5.format(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat172");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat173");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat174");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat175");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat176");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str5 = compositeFormat2.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat177");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat178");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat179");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat5.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat180");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat6.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat181");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat182");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat183");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat184");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat185");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat5.format((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat186");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat5.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat187");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat188");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat189");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj4 = format3.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat190");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat191");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.lang.Class<?> wildcardClass8 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat192");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat193");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat194");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat195");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = format5.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat196");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getFormatter();
        java.lang.Object obj9 = compositeFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat197");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = compositeFormat4.format((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat198");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj5 = compositeFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat199");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat200");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat201");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat202");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getFormatter();
        java.text.Format format9 = compositeFormat5.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat203");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format5.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat204");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getFormatter();
        java.lang.Class<?> wildcardClass9 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat205");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat206");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat207");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat208");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat209");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str5 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat210");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat211");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = compositeFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat212");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat213");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat214");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str5 = compositeFormat2.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void CompositeFormat215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat215");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = compositeFormat2.format((java.lang.Object) (-1L), stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat216");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat217");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat218");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass4 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CompositeFormat219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat219");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat220");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CompositeFormat221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat221");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat222");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat223");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat224");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat5.formatToCharacterIterator((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat225");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat5.format(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat226");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat227");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = format4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat228");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj4 = format3.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat229");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = compositeFormat4.format((java.lang.Object) (short) -1, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat230");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format5.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat231");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.text.Format format8 = compositeFormat5.getFormatter();
        java.lang.Object obj9 = compositeFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat232");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = new java.lang.Object();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat4.formatToCharacterIterator(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat233");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat234");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat235");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat236");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat6.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat237");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = format7.formatToCharacterIterator((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat238");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat239");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat240");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat241");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat242");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat243");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        java.lang.Class<?> wildcardClass8 = format7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat244");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat245");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat246");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat247");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.lang.Object obj8 = compositeFormat5.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat248");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat249");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat250");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass8 = format7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat251");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = compositeFormat2.format((java.lang.Object) 100.0d, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat252");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat253");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat254");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.text.Format format8 = compositeFormat5.getFormatter();
        java.lang.Class<?> wildcardClass9 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat255");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat256");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat257");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat258");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass8 = format7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat259");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat260");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = compositeFormat5.getFormatter();
        java.lang.Object obj9 = compositeFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat261");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getFormatter();
        java.text.Format format9 = compositeFormat5.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat262");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat263");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat4.formatToCharacterIterator(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat264");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat265");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = format4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat266");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.text.Format format8 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat(format7, format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat267");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat268");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat269");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj5 = compositeFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void CompositeFormat270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat270");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat271");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat5.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat272");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.text.Format format8 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat273");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = compositeFormat5.getParser();
        java.lang.Object obj9 = compositeFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat274");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat6.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat275");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat276");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat277");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.text.Format format8 = compositeFormat5.getFormatter();
        java.text.Format format9 = compositeFormat5.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat278");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat279");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat280");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat281");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat282");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat283");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat284");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat5.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat285");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat5, format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat286");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = format4.format((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat287");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass4 = format3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat288");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat289");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat290");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat291");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat2.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat292");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format7.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat293");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void CompositeFormat294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat294");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat295");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat296");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat297");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat5.format((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat298");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = format7.formatToCharacterIterator(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat299");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat300");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat301");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass6 = format4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat302");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = format7.formatToCharacterIterator((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat303");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = new java.lang.Object();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.format(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat304");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass8 = format7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat305");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat306");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat307");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getParser();
        java.text.Format format9 = compositeFormat5.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat308");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat309");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat310");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat311");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat312");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat313");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getFormatter();
        java.text.Format format9 = compositeFormat5.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat314");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat315");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat316");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat317");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat318");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat5.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat319");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat5.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat320");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat321");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = format7.format((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat322");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.format((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat323");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.lang.Object obj6 = compositeFormat5.clone();
        java.lang.Object obj7 = compositeFormat5.clone();
        java.lang.Object obj8 = compositeFormat5.clone();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void CompositeFormat324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat324");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat325");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat326");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat327");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat328");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat329");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat330");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat331");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.lang.Object obj8 = compositeFormat5.clone();
        java.text.Format format9 = compositeFormat5.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat332");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.lang.Object obj8 = compositeFormat5.clone();
        java.lang.Object obj9 = compositeFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat333");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat334");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = compositeFormat5.getFormatter();
        java.lang.Class<?> wildcardClass9 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat335");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat336");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat337");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat338");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat339");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat340");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat341");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat342");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat343");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.lang.Object obj8 = compositeFormat5.clone();
        java.lang.Class<?> wildcardClass9 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat344");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat345");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat346");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass6 = format5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat347");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat348");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat349");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat350");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = format5.format((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat351");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat352");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void CompositeFormat353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat353");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.lang.Class<?> wildcardClass8 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat354");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat355");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getParser();
        java.lang.Object obj9 = compositeFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat356");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj5 = format4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat357");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat358");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat6.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
    }

    @Test
    public void CompositeFormat359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat359");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat5.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat360");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = format6.formatToCharacterIterator(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat361");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat362");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat363");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass8 = format7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat364");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat365");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = compositeFormat2.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat366");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat367");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat2.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat368");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass8 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat369");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat370");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat371");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat372");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = format5.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat373");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat374");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat6.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat375");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat6.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat376");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat377");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat378");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat4.format((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat379");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat380");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Class<?> wildcardClass7 = compositeFormat6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat381");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat382");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        java.lang.Object obj8 = format7.clone();
        java.lang.Object obj9 = format7.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat383");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = compositeFormat2.format(obj5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat384");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getParser();
        java.lang.Object obj9 = compositeFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat385");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = compositeFormat2.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void CompositeFormat386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat386");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat6.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat387");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat388");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.lang.Object obj8 = compositeFormat5.clone();
        java.text.Format format9 = compositeFormat5.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat389");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat390");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat391");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat392");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        java.text.Format format8 = compositeFormat6.getParser();
        java.text.Format format9 = compositeFormat6.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat393");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat394");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat395");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj5 = format4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat396");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat397");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass8 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat398");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass6 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompositeFormat399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat399");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat400");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat401");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = format5.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat402");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat6.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat403");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = new java.lang.Object();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat6.formatToCharacterIterator(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat404");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat405");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass6 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompositeFormat406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat406");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat407");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat408");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat409");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.lang.Object obj8 = compositeFormat5.clone();
        java.text.Format format9 = compositeFormat5.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat410");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.lang.Object obj9 = compositeFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat411");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat412");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.lang.Class<?> wildcardClass8 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat413");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat414");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat6.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
    }

    @Test
    public void CompositeFormat415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat415");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat416");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat417");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat418");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = compositeFormat2.format(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void CompositeFormat419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat419");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat420");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat421");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat422");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat423");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat424");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat425");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat426");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat427");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        java.text.Format format8 = compositeFormat6.getParser();
        java.text.Format format9 = compositeFormat6.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format9);
    }

    @Test
    public void CompositeFormat428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat428");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat429");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat430");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat431");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = compositeFormat4.format((java.lang.Object) 100L, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat432");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat433");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass7 = format6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat434");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass7 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat435");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        java.lang.Object obj8 = format7.clone();
        java.lang.Class<?> wildcardClass9 = format7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat436");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat437");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat438");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat439");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat440");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat441");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat442");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat443");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.lang.Object obj8 = compositeFormat5.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat444");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat445");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat446");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat447");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = format6.formatToCharacterIterator(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat448");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat449");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        java.text.Format format8 = compositeFormat6.getFormatter();
        java.text.Format format9 = compositeFormat6.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format9);
    }

    @Test
    public void CompositeFormat450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat450");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat451");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat452");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat5.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat453");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat454");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat455");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format7.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat456");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.lang.Object obj6 = compositeFormat5.clone();
        java.text.Format format7 = compositeFormat5.getParser();
        java.lang.Object obj8 = compositeFormat5.clone();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void CompositeFormat457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat457");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Class<?> wildcardClass8 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat458");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat459");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = compositeFormat2.format((java.lang.Object) 1, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat460");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Class<?> wildcardClass5 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompositeFormat461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat461");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass7 = format6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat462");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.lang.Object obj8 = compositeFormat5.clone();
        java.text.Format format9 = compositeFormat5.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat463");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat464");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat465");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompositeFormat466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat466");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat467");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat468");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat469");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat2.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat470");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat471");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat6.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat472");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat4.formatToCharacterIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat473");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat474");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat475");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat476");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat2.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat477");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = compositeFormat2.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat478");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat5.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat479");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat480");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat481");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat482");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Class<?> wildcardClass7 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat483");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat484");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat4.formatToCharacterIterator(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat485");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat486");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat487");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat488");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat489");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass8 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat490");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat491");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat492");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat6.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat493");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat494");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat495");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat496");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat497");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat498");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat499");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.CompositeFormat500");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.lang.Object obj6 = compositeFormat5.clone();
        java.text.Format format7 = compositeFormat5.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat8 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj9 = compositeFormat8.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }
}

