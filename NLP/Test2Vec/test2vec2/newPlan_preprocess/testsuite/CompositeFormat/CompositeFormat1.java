package CompositeFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompositeFormat1 {

    public static boolean debug = false;

    @Test
    public void CompositeFormat501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat501");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
    public void CompositeFormat502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat502");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        java.text.Format format4 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format3, format4);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format2, format4);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat7 = new org.apache.commons.lang3.text.CompositeFormat(format1, (java.text.Format) compositeFormat6);
        java.lang.Object obj8 = compositeFormat7.clone();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void CompositeFormat503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat503");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
    public void CompositeFormat504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat504");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat2.parseObject("hi!", parsePosition7);
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
    public void CompositeFormat505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat505");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getParser();
        java.text.Format format9 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat506");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
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
    public void CompositeFormat507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat507");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.text.Format format8 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat508");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
    public void CompositeFormat509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat509");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = format7.formatToCharacterIterator(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat510");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat2.reformat("");
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
    public void CompositeFormat511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat511");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.lang.Object obj6 = compositeFormat5.clone();
        java.text.Format format7 = compositeFormat5.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat8 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format9 = compositeFormat5.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat512");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getParser();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat513");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.text.Format format9 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat514");
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
            java.lang.Object obj9 = format7.parseObject("hi!");
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
    public void CompositeFormat515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat515");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat516");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
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
    public void CompositeFormat517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat517");
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
            java.lang.Class<?> wildcardClass9 = format8.getClass();
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
    public void CompositeFormat518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat518");
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
    public void CompositeFormat519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat519");
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
    public void CompositeFormat520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat520");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
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
    public void CompositeFormat521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat521");
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
    public void CompositeFormat522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat522");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat523");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("hi!");
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
    public void CompositeFormat524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat524");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
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
    public void CompositeFormat525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat525");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getFormatter();
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
    }

    @Test
    public void CompositeFormat526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat526");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
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
    public void CompositeFormat527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat527");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompositeFormat528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat528");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat529");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat530");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat2.parseObject("");
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
    public void CompositeFormat531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat531");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat532");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass6 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompositeFormat533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat533");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.text.Format format9 = compositeFormat4.getParser();
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
    public void CompositeFormat534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat534");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat535");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
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
    public void CompositeFormat536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat536");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
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
    public void CompositeFormat537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat537");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str5 = compositeFormat2.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void CompositeFormat538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat538");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getFormatter();
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
    }

    @Test
    public void CompositeFormat539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat539");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat5.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat540");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
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
    public void CompositeFormat541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat541");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getParser();
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
    public void CompositeFormat542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat542");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat5.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat543");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat544");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj5 = compositeFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void CompositeFormat545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat545");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
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
    public void CompositeFormat546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat546");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("hi!");
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
    public void CompositeFormat547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat547");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat4, format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat548");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
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
    public void CompositeFormat549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat549");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
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
    public void CompositeFormat550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat550");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
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
    public void CompositeFormat551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat551");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
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
    public void CompositeFormat552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat552");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat553");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat554");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat2.reformat("");
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
    }

    @Test
    public void CompositeFormat555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat555");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.lang.Object obj6 = compositeFormat5.clone();
        java.text.Format format7 = compositeFormat5.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat8 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj9 = compositeFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat556");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.text.Format format8 = compositeFormat2.getFormatter();
        java.text.Format format9 = compositeFormat2.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
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
    public void CompositeFormat557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat557");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        java.text.Format format8 = compositeFormat6.getFormatter();
        java.lang.Object obj9 = compositeFormat6.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat558");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getParser();
        java.lang.Object obj9 = compositeFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
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
    public void CompositeFormat559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat559");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("hi!");
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
    public void CompositeFormat560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat560");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
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
    public void CompositeFormat561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat561");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getParser();
        java.text.Format format9 = compositeFormat2.getFormatter();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat562");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat563");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass8 = format7.getClass();
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
    public void CompositeFormat564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat564");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Object obj9 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
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
    public void CompositeFormat565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat565");
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
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat566");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
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
    public void CompositeFormat567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat567");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
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
    public void CompositeFormat568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat568");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        java.text.Format format8 = compositeFormat6.getParser();
        java.text.Format format9 = compositeFormat6.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat569");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat2.reformat("hi!");
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
    public void CompositeFormat570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat570");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
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
    public void CompositeFormat571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat571");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat572");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat2.formatToCharacterIterator(obj8);
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
    public void CompositeFormat573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat573");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat5.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat574");
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
    public void CompositeFormat575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat575");
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
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat576");
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
            java.lang.String str9 = compositeFormat5.reformat("");
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
    public void CompositeFormat577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat577");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat6.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat578");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.lang.Class<?> wildcardClass4 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CompositeFormat579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat579");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
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
    public void CompositeFormat580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat580");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str6 = format4.format((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat581");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.text.Format format8 = compositeFormat2.getParser();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat582");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.lang.Object obj5 = null;
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
    public void CompositeFormat583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat583");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj5 = compositeFormat2.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat584");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
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
    public void CompositeFormat585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat585");
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
    public void CompositeFormat586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat586");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        java.text.Format format8 = compositeFormat6.getParser();
        java.text.Format format9 = compositeFormat6.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format9);
    }

    @Test
    public void CompositeFormat587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat587");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
    public void CompositeFormat588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat588");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat2.parseObject("");
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
    public void CompositeFormat589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat589");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat590");
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
    public void CompositeFormat591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat591");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass5 = format4.getClass();
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
    public void CompositeFormat592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat592");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = format6.format((java.lang.Object) (byte) -1);
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
    public void CompositeFormat593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat593");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
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
    public void CompositeFormat594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat594");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Class<?> wildcardClass7 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat595");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat596");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat2.reformat("hi!");
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
    public void CompositeFormat597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat597");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = format5.formatToCharacterIterator((java.lang.Object) false);
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
    public void CompositeFormat598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat598");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
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
    public void CompositeFormat599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat599");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
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
    public void CompositeFormat600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat600");
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
    public void CompositeFormat601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat601");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass9 = compositeFormat2.getClass();
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
    public void CompositeFormat602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat602");
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
            java.lang.Class<?> wildcardClass8 = format7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat603");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
    public void CompositeFormat604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat604");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        java.text.Format format8 = compositeFormat6.getFormatter();
        java.lang.Class<?> wildcardClass9 = format8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat605");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat2.reformat("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat606");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        java.text.Format format8 = compositeFormat6.getFormatter();
        java.lang.Object obj9 = format8.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat607");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
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
    public void CompositeFormat608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat608");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = format4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat609");
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
            java.lang.Object obj9 = compositeFormat6.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
    }

    @Test
    public void CompositeFormat610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat610");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.text.Format format9 = compositeFormat4.getParser();
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
    public void CompositeFormat611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat611");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat4.parseObject("hi!");
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
    public void CompositeFormat612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat612");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = format5.clone();
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
    public void CompositeFormat613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat613");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
        java.text.Format format8 = compositeFormat5.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat614");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
    public void CompositeFormat615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat615");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat616");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat617");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("hi!");
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
    public void CompositeFormat618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat618");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
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
    public void CompositeFormat619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat619");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
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
    public void CompositeFormat620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat620");
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
    public void CompositeFormat621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat621");
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
            java.lang.Object obj9 = compositeFormat2.parseObject("hi!");
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
    public void CompositeFormat622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat622");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat623");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        java.text.Format format8 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat6, format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat624");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.lang.Class<?> wildcardClass7 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat625");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat626");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
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
    public void CompositeFormat627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat627");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
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
    public void CompositeFormat628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat628");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = format4.parseObject("");
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
    public void CompositeFormat629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat629");
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
            java.lang.Class<?> wildcardClass8 = format7.getClass();
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
    public void CompositeFormat630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat630");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
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
    public void CompositeFormat631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat631");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
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
    public void CompositeFormat632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat632");
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
            java.lang.Object obj9 = format7.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
    }

    @Test
    public void CompositeFormat633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat633");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
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
    public void CompositeFormat634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat634");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat6.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat635");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat636");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat(format7, format8);
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
    public void CompositeFormat637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat637");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        java.lang.Object obj8 = format7.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat638");
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
    public void CompositeFormat639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat639");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat640");
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
    public void CompositeFormat641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat641");
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
    public void CompositeFormat642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat642");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.text.Format format8 = compositeFormat2.getFormatter();
        java.text.Format format9 = compositeFormat2.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
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
    public void CompositeFormat643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat643");
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
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat644");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.text.Format format6 = compositeFormat5.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat7 = new org.apache.commons.lang3.text.CompositeFormat(format0, format6);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat7.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat645");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj7 = format5.parseObject("");
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
    public void CompositeFormat646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat646");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat647");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
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
    public void CompositeFormat648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat648");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
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
    public void CompositeFormat649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat649");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
        java.text.Format format7 = compositeFormat4.getFormatter();
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
    public void CompositeFormat650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat650");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat2.reformat("hi!");
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
    public void CompositeFormat651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat651");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Class<?> wildcardClass5 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompositeFormat652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat652");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass8 = compositeFormat2.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat653");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getFormatter();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat654");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = compositeFormat5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat655");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat5.getParser();
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
    public void CompositeFormat656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat656");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
        java.text.Format format9 = compositeFormat4.getParser();
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
    public void CompositeFormat657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat657");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass7 = format6.getClass();
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
    public void CompositeFormat658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat658");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.lang.Object obj7 = compositeFormat5.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat659");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat660");
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
            java.lang.Object obj8 = format7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat661");
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
    public void CompositeFormat662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat662");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = compositeFormat6.formatToCharacterIterator(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat663");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        java.text.Format format8 = compositeFormat6.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat664");
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
            java.lang.Object obj9 = compositeFormat6.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format7);
    }

    @Test
    public void CompositeFormat665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat665");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
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
    public void CompositeFormat666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat666");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat667");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
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
    public void CompositeFormat668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat668");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
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
    public void CompositeFormat669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat669");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
    public void CompositeFormat670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat670");
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
            java.lang.Class<?> wildcardClass8 = format7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat671");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.text.Format format8 = compositeFormat2.getParser();
        java.text.Format format9 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat672");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat6.formatToCharacterIterator(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat673");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat674");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.text.Format format6 = compositeFormat5.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat7 = new org.apache.commons.lang3.text.CompositeFormat(format0, format6);
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat7.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat675");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
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
    public void CompositeFormat676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat676");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = format5.formatToCharacterIterator(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat677");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format5);
        java.text.Format format7 = compositeFormat6.getFormatter();
        java.text.Format format8 = compositeFormat6.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat678");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getParser();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat679");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
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
    public void CompositeFormat680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat680");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = compositeFormat5.getParser();
        java.text.Format format9 = compositeFormat5.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat681");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.lang.Object obj4 = compositeFormat3.clone();
        java.lang.Object obj5 = compositeFormat3.clone();
        java.text.Format format6 = compositeFormat3.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat7 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat3);
        java.text.Format format8 = compositeFormat7.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat682");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass8 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
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
    public void CompositeFormat683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat683");
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
            java.lang.Object obj8 = format7.clone();
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
    public void CompositeFormat684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat684");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.text.Format format8 = compositeFormat2.getFormatter();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat685");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.lang.Object obj6 = compositeFormat5.clone();
        java.text.Format format7 = compositeFormat5.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat8 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Class<?> wildcardClass9 = compositeFormat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat686");
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
    public void CompositeFormat687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat687");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Object obj8 = compositeFormat2.clone();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void CompositeFormat688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat688");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat689");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        java.text.Format format8 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat(format7, format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat690");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format6.parseObject("");
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
    public void CompositeFormat691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat691");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getParser();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat692");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        java.lang.Class<?> wildcardClass9 = compositeFormat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat693");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
    public void CompositeFormat694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat694");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.lang.Object obj8 = compositeFormat5.clone();
        java.lang.Object obj9 = compositeFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
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
    public void CompositeFormat695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat695");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
    public void CompositeFormat696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat696");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Object obj8 = compositeFormat2.clone();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void CompositeFormat697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat697");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
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
    public void CompositeFormat698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat698");
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
            java.lang.String str9 = compositeFormat2.reformat("hi!");
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
    public void CompositeFormat699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat699");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.lang.Object obj8 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void CompositeFormat700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat700");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
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
    public void CompositeFormat701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat701");
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
    public void CompositeFormat702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat702");
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
    public void CompositeFormat703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat703");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
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
    public void CompositeFormat704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat704");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
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
    public void CompositeFormat705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat705");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.text.Format format8 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat706");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
    public void CompositeFormat707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat707");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
    public void CompositeFormat708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat708");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.text.Format format9 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat709");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
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
    public void CompositeFormat710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat710");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
        java.text.Format format9 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat711");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
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
    public void CompositeFormat712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat712");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat713");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
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
    public void CompositeFormat714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat714");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
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
    public void CompositeFormat715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat715");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
    public void CompositeFormat716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat716");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.text.Format format7 = compositeFormat4.getParser();
        java.text.Format format8 = compositeFormat4.getFormatter();
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
    public void CompositeFormat717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat717");
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
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat718");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.lang.Object obj4 = compositeFormat3.clone();
        java.lang.Object obj5 = compositeFormat3.clone();
        java.text.Format format6 = compositeFormat3.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat7 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat3);
        java.lang.Class<?> wildcardClass8 = compositeFormat7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompositeFormat719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat719");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass5 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompositeFormat720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat720");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
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
    public void CompositeFormat721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat721");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
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
    public void CompositeFormat722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat722");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
    public void CompositeFormat723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat723");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = compositeFormat4.format((java.lang.Object) (short) 100, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat724");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
    public void CompositeFormat725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat725");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getFormatter();
        java.text.Format format9 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat726");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
    public void CompositeFormat727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat727");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        java.text.Format format8 = compositeFormat6.getParser();
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
    public void CompositeFormat728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat728");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = compositeFormat2.formatToCharacterIterator((java.lang.Object) (byte) 10);
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
    public void CompositeFormat729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat729");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
    public void CompositeFormat730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat730");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat731");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.text.Format format9 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat732");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
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
    public void CompositeFormat733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat733");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
        java.text.Format format9 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat734");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = compositeFormat5.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat735");
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
            java.lang.String str9 = compositeFormat5.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat736");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat737");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat2.reformat("hi!");
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
    public void CompositeFormat738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat738");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.lang.Object obj6 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass7 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat739");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
        java.text.Format format7 = compositeFormat4.getFormatter();
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
    public void CompositeFormat740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat740");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
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
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat741");
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
    public void CompositeFormat742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat742");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat2.parseObject("hi!");
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
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat743");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
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
    public void CompositeFormat744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat744");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getParser();
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
    public void CompositeFormat745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat745");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
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
    public void CompositeFormat746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat746");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.text.Format format8 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass9 = compositeFormat2.getClass();
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
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat747");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.lang.Object obj4 = compositeFormat3.clone();
        java.lang.Object obj5 = compositeFormat3.clone();
        java.text.Format format6 = compositeFormat3.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat7 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat3);
        java.text.Format format8 = compositeFormat7.getFormatter();
        java.lang.Object obj9 = format8.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat748");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Class<?> wildcardClass9 = format8.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat749");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getParser();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat750");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CompositeFormat751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat751");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj5 = compositeFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat752");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj5 = format3.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
    }

    @Test
    public void CompositeFormat753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat753");
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
    public void CompositeFormat754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat754");
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
            java.lang.String str9 = compositeFormat2.reformat("");
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
    public void CompositeFormat755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat755");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
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
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat756");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
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
    public void CompositeFormat757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat757");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.lang.Object obj6 = compositeFormat5.clone();
        java.text.Format format7 = compositeFormat5.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat8 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Class<?> wildcardClass9 = compositeFormat8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompositeFormat758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat758");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
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
    public void CompositeFormat759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat759");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass5 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompositeFormat760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat760");
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
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat761");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat762");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.lang.Object obj4 = compositeFormat3.clone();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat3);
        java.lang.Class<?> wildcardClass6 = compositeFormat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompositeFormat763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat763");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat764");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat2.format((java.lang.Object) "hi!");
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
    public void CompositeFormat765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat765");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
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
    public void CompositeFormat766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat766");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
    public void CompositeFormat767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat767");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = format8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat768");
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
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = format7.formatToCharacterIterator((java.lang.Object) true);
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
    public void CompositeFormat769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat769");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.lang.Object obj8 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat770");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.lang.Object obj6 = compositeFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat771");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.lang.Object obj4 = compositeFormat3.clone();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat3);
        java.lang.Object obj6 = compositeFormat3.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat772");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat5.parseObject("", parsePosition8);
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
    public void CompositeFormat773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat773");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat2.reformat("");
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
    public void CompositeFormat774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat774");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.text.Format format8 = compositeFormat4.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat775");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
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
    public void CompositeFormat776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat776");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format5);
        java.text.Format format7 = compositeFormat2.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat777");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getParser();
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
    public void CompositeFormat778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat778");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
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
    public void CompositeFormat779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat779");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = compositeFormat5.getParser();
        java.text.Format format9 = compositeFormat5.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
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
    public void CompositeFormat780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat780");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.lang.Object obj6 = compositeFormat5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void CompositeFormat781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat781");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
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
    public void CompositeFormat782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat782");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat2.reformat("hi!");
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
    public void CompositeFormat783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat783");
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
            java.lang.String str9 = compositeFormat2.reformat("hi!");
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
    public void CompositeFormat784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat784");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Class<?> wildcardClass7 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat785");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj8 = format7.clone();
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
    public void CompositeFormat786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat786");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat787");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str9 = compositeFormat2.reformat("");
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
    public void CompositeFormat788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat788");
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
            java.lang.Object obj9 = compositeFormat6.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat789");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
    public void CompositeFormat790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat790");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass6 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompositeFormat791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat791");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.lang.Object obj4 = compositeFormat3.clone();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat3);
        java.text.Format format6 = compositeFormat3.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj9 = compositeFormat3.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat792");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void CompositeFormat793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat793");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass7 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat794");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = compositeFormat4.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void CompositeFormat795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat795");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass8 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
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
    public void CompositeFormat796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat796");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.lang.Object obj6 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass7 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompositeFormat797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat797");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str7 = compositeFormat2.reformat("");
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
    public void CompositeFormat798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat798");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.Object obj6 = format4.parseObject("");
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
    public void CompositeFormat799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat799");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getFormatter();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat800");
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
            java.lang.Class<?> wildcardClass9 = format8.getClass();
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
    public void CompositeFormat801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat801");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat802");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.lang.String str8 = compositeFormat2.reformat("");
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
    public void CompositeFormat803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat803");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
    public void CompositeFormat804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat804");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
    public void CompositeFormat805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat805");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = compositeFormat5.getParser();
        java.text.Format format9 = compositeFormat5.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat806");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        java.text.Format format4 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format3, format4);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format2, format4);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat7 = new org.apache.commons.lang3.text.CompositeFormat(format1, (java.text.Format) compositeFormat6);
        java.text.Format format8 = compositeFormat6.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat(format0, format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat807");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = null;
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
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat808");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getParser();
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
    }

    @Test
    public void CompositeFormat809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat809");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getParser();
        java.text.Format format9 = compositeFormat2.getParser();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat810");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        java.text.Format format8 = compositeFormat2.getFormatter();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat811");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.text.Format format9 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format9);
    }

    @Test
    public void CompositeFormat812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat812");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format5);
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
    }

    @Test
    public void CompositeFormat813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.CompositeFormat813");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in CompositeFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = format5.formatToCharacterIterator((java.lang.Object) (-1.0d));
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
}

