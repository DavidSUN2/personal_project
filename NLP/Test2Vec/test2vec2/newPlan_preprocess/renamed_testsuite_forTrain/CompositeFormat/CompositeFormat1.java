
package CompositeFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompositeFormat1 {

    public static boolean debug = false;

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test501");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test502");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test503");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test504");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test505");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test506");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test507");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.lang.Object obj7 = compositeFormat2.clone();
        java.text.Format format8 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test508");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test509");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test510");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test511");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test512");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test513");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test514");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test515");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test516");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test517");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test518");
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
            System.out.format("%n%s%n", "CompositeFormat1.test519");
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
            System.out.format("%n%s%n", "CompositeFormat1.test520");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test521");
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
            System.out.format("%n%s%n", "CompositeFormat1.test522");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test523");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test524");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test525");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test526");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test527");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test528");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
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
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test529");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test530");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test531");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test532");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test533");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test534");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test535");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test536");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test537");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test538");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test539");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compositeFormat5.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test540");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test541");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test542");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test543");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test544");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test545");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test546");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test547");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test548");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test549");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test550");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test551");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test552");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = compositeFormat4.clone();
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test553");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test554");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test555");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test556");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test557");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test558");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test559");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test560");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test561");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test562");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test563");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test564");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test565");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test566");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test567");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test568");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test569");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test570");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test571");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test572");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test573");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compositeFormat5.reformat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test574");
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
            System.out.format("%n%s%n", "CompositeFormat1.test575");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test576");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test577");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test578");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test579");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test580");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test581");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test582");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.lang.Object obj5 = null;
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
            System.out.format("%n%s%n", "CompositeFormat1.test583");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = compositeFormat2.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test584");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test585");
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
            System.out.format("%n%s%n", "CompositeFormat1.test586");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test587");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test588");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test589");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
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
            System.out.format("%n%s%n", "CompositeFormat1.test590");
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
            System.out.format("%n%s%n", "CompositeFormat1.test591");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test592");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test593");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test594");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test595");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test596");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test597");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test598");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test599");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test600");
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
            System.out.format("%n%s%n", "CompositeFormat1.test601");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test602");
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
            java.lang.Class<?> wildcardClass8 = format7.getClass();
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
            System.out.format("%n%s%n", "CompositeFormat1.test603");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test604");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test605");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test606");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test607");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test608");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test609");
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
            java.lang.Object obj9 = compositeFormat6.parseObject("hi!");
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
            System.out.format("%n%s%n", "CompositeFormat1.test610");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test611");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test612");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test613");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test614");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test615");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test616");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test617");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test618");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test619");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test620");
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
            System.out.format("%n%s%n", "CompositeFormat1.test621");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test622");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test623");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test624");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test625");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test626");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test627");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test628");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test629");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test630");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test631");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test632");
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
            java.lang.Object obj9 = format7.parseObject("hi!");
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
            System.out.format("%n%s%n", "CompositeFormat1.test633");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test634");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test635");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test636");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test637");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test638");
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
            System.out.format("%n%s%n", "CompositeFormat1.test639");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test640");
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
            System.out.format("%n%s%n", "CompositeFormat1.test641");
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
            System.out.format("%n%s%n", "CompositeFormat1.test642");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test643");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test644");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.text.Format format6 = compositeFormat5.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat7 = new org.apache.commons.lang3.text.CompositeFormat(format0, format6);
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test645");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test646");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test647");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test648");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test649");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test650");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test651");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test652");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test653");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test654");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = compositeFormat5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test655");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test656");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test657");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test658");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test659");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test660");
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
            java.lang.Object obj8 = format7.clone();
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
            System.out.format("%n%s%n", "CompositeFormat1.test661");
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
            System.out.format("%n%s%n", "CompositeFormat1.test662");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test663");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat6.clone();
        java.text.Format format8 = compositeFormat6.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test664");
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
            java.lang.Object obj9 = compositeFormat6.parseObject("");
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
            System.out.format("%n%s%n", "CompositeFormat1.test665");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test666");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test667");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test668");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test669");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test670");
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
            java.lang.Class<?> wildcardClass8 = format7.getClass();
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
            System.out.format("%n%s%n", "CompositeFormat1.test671");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test672");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = null;
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
            System.out.format("%n%s%n", "CompositeFormat1.test673");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test674");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        java.text.Format format6 = compositeFormat5.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat7 = new org.apache.commons.lang3.text.CompositeFormat(format0, format6);
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test675");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test676");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test677");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test678");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test679");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getFormatter();
        java.text.Format format6 = compositeFormat4.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test680");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test681");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.lang.Object obj4 = compositeFormat3.clone();
        java.lang.Object obj5 = compositeFormat3.clone();
        java.text.Format format6 = compositeFormat3.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat7 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat3);
        java.text.Format format8 = compositeFormat7.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test682");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test683");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test684");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test685");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test686");
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
            System.out.format("%n%s%n", "CompositeFormat1.test687");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test688");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test689");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test690");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test691");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test692");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test693");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test694");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test695");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test696");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test697");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test698");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test699");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test700");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test701");
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
            System.out.format("%n%s%n", "CompositeFormat1.test702");
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
            System.out.format("%n%s%n", "CompositeFormat1.test703");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test704");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test705");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test706");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test707");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test708");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test709");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test710");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test711");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test712");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test713");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test714");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test715");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test716");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test717");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test718");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test719");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test720");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test721");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test722");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test723");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = compositeFormat4.format((java.lang.Object) (short) 100, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test724");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test725");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test726");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test727");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.text.Format format7 = compositeFormat6.getParser();
        java.text.Format format8 = compositeFormat6.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test728");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test729");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
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
            System.out.format("%n%s%n", "CompositeFormat1.test730");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test731");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test732");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test733");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test734");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = compositeFormat5.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test735");
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
            java.lang.String str9 = compositeFormat5.reformat("");
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
            System.out.format("%n%s%n", "CompositeFormat1.test736");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test737");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test738");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test739");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test740");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test741");
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
            System.out.format("%n%s%n", "CompositeFormat1.test742");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test743");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test744");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test745");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test746");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test747");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test748");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.text.Format format8 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test749");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test750");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test751");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test752");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test753");
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
            System.out.format("%n%s%n", "CompositeFormat1.test754");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test755");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.text.Format format5 = compositeFormat4.getParser();
        java.text.Format format6 = compositeFormat4.getFormatter();
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
        org.junit.Assert.assertNull(format5);
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
            System.out.format("%n%s%n", "CompositeFormat1.test756");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test757");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test758");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test759");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test760");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test761");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test762");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test763");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test764");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.lang.Object obj7 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test765");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test766");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test767");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        java.text.Format format3 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format2, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format1, format3);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat5);
        java.lang.Object obj7 = compositeFormat5.clone();
        java.text.Format format8 = compositeFormat5.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test768");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test769");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test770");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test771");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test772");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.text.Format format4 = compositeFormat3.getFormatter();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, format4);
        java.text.Format format6 = compositeFormat5.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test773");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test774");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test775");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test776");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test777");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test778");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test779");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test780");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test781");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test782");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test783");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test784");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test785");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test786");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test787");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test788");
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
            java.lang.Object obj9 = compositeFormat6.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test789");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test790");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test791");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        java.lang.Object obj4 = compositeFormat3.clone();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format0, (java.text.Format) compositeFormat3);
        java.text.Format format6 = compositeFormat3.getFormatter();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test792");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test793");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test794");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test795");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test796");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test797");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test798");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test799");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test800");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test801");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        java.text.Format format7 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test802");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.Format format6 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test803");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test804");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
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
            System.out.format("%n%s%n", "CompositeFormat1.test805");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test806");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test807");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        java.text.Format format2 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat3 = new org.apache.commons.lang3.text.CompositeFormat(format1, format2);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat(format0, format2);
        java.lang.Object obj5 = compositeFormat4.clone();
        java.text.Format format6 = compositeFormat4.getFormatter();
        java.lang.Object obj7 = compositeFormat4.clone();
        java.lang.Object obj8 = null;
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
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test808");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test809");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test810");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test811");
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
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test812");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getParser();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat6 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format5);
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
    }

    @Test
    public void CompositeFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat1.test813");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = compositeFormat2.getFormatter();
        java.text.Format format4 = compositeFormat2.getParser();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
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

