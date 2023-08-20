
package CompositeFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompositeFormat0 {

    public static boolean debug = false;

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test001");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compositeFormat2.format((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test002");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test003");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = compositeFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test004");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = compositeFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test005");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Class<?> wildcardClass3 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test006");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test007");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test008");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test009");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test010");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test011");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compositeFormat4.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test012");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = compositeFormat4.format((java.lang.Object) (byte) 0, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test013");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = compositeFormat4.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test014");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test015");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test016");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test017");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = compositeFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test018");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test019");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test020");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = compositeFormat2.formatToCharacterIterator((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test021");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test022");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test023");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test024");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test025");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test026");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test027");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compositeFormat2.format((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test028");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test029");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test030");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test031");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compositeFormat2.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test032");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test033");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test034");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test035");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test036");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test037");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test038");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test039");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test040");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test041");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test042");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test043");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = compositeFormat4.formatToCharacterIterator((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test044");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test045");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test046");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compositeFormat2.format((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test047");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test048");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test049");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test050");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test051");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test052");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test053");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test054");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test055");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test056");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test057");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test058");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test059");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test060");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test061");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test062");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test063");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = compositeFormat4.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test064");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test065");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test066");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test067");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test068");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test069");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test070");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test071");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test072");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test073");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test074");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test075");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test076");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test077");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test078");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test079");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test080");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compositeFormat4.format((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test081");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test082");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test083");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test084");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test085");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test086");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test087");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compositeFormat4.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test088");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test089");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test090");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test091");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test092");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test093");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test094");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test095");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test096");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test097");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test098");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test099");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test100");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test101");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test102");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test103");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test104");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test105");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test106");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test107");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test108");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test109");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test110");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test111");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test112");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test113");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = compositeFormat4.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test114");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test115");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test116");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test117");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test118");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test119");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test120");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test121");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test122");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test123");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test124");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test125");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test126");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test127");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test128");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test129");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test130");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test131");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test132");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test133");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test134");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test135");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test136");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test137");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test138");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test139");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test140");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test141");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test142");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test143");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test144");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test145");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test146");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test147");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test148");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test149");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test150");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compositeFormat5.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test151");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.lang.Object obj4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test152");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test153");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test154");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test155");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test156");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test157");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat5.formatToCharacterIterator((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test158");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test159");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test160");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat5.formatToCharacterIterator((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test161");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test162");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test163");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test164");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test165");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test166");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test167");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test168");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test169");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test170");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test171");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test172");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test173");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test174");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test175");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test176");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test177");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test178");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test179");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test180");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compositeFormat6.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test181");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test182");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test183");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test184");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test185");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compositeFormat5.format((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test186");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = compositeFormat5.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test187");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test188");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test189");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test190");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test191");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test192");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test193");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test194");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test195");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test196");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test197");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compositeFormat4.format((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test198");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test199");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test200");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test201");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test202");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test203");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test204");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test205");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test206");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test207");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test208");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test209");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test210");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test211");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test212");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test213");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test214");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test215");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = compositeFormat2.format((java.lang.Object) (-1L), stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test216");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test217");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test218");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test219");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test220");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test221");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test222");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test223");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test224");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test225");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test226");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test227");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test228");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test229");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test230");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test231");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test232");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test233");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test234");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test235");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test236");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = compositeFormat6.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test237");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test238");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test239");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test240");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test241");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test242");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test243");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test244");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test245");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test246");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test247");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test248");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test249");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test250");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test251");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test252");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test253");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test254");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test255");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test256");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test257");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test258");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test259");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test260");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test261");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test262");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test263");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test264");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test265");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test266");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test267");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test268");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test269");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test270");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test271");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test272");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.text.Format format8 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test273");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test274");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test275");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test276");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test277");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test278");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test279");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test280");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test281");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test282");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test283");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test284");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test285");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test286");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test287");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test288");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test289");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test290");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test291");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test292");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test293");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test294");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test295");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test296");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test297");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test298");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test299");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test300");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test301");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test302");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test303");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test304");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test305");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test306");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test307");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test308");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test309");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test310");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test311");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test312");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test313");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test314");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test315");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test316");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test317");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test318");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test319");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test320");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test321");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test322");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test323");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test324");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test325");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test326");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test327");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test328");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test329");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test330");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test331");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test332");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test333");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test334");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test335");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test336");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test337");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test338");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test339");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test340");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test341");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test342");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test343");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test344");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test345");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test346");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test347");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test348");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test349");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test350");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test351");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test352");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test353");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test354");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test355");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test356");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test357");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test358");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test359");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test360");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test361");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test362");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test363");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test364");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test365");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test366");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test367");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test368");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test369");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test370");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test371");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test372");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test373");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test374");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format5);
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test375");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format5);
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test376");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test377");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test378");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test379");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test380");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test381");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test382");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test383");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test384");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test385");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test386");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test387");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test388");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test389");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test390");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test391");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test392");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test393");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test394");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test395");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test396");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test397");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test398");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test399");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test400");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test401");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test402");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test403");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat6.formatToCharacterIterator(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test404");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test405");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test406");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test407");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test408");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test409");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test410");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test411");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test412");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test413");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test414");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test415");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test416");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test417");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test418");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test419");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test420");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test421");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test422");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test423");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test424");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test425");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test426");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test427");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test428");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test429");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test430");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test431");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test432");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test433");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test434");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test435");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test436");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test437");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test438");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test439");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test440");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test441");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test442");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test443");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test444");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test445");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test446");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test447");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test448");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test449");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test450");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test451");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test452");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test453");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test454");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test455");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test456");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test457");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test458");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test459");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test460");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test461");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test462");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test463");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test464");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test465");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test466");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test467");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test468");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test469");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test470");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test471");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test472");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test473");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test474");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test475");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test476");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test477");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test478");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test479");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test480");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test481");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test482");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test483");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test484");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test485");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test486");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test487");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test488");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test489");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test490");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test491");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test492");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = compositeFormat6.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test493");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test494");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test495");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test496");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test497");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test498");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test499");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test500");
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

