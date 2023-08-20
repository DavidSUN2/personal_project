package CompositeFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompositeFormat0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test01");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = compositeFormat2.format((java.lang.Object) (byte) -1, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test07");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = compositeFormat2.format((java.lang.Object) 100.0f, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test14");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compositeFormat2.reformat("hi!");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test15");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compositeFormat2.format((java.lang.Object) (short) -1);
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test16");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = compositeFormat2.format((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test17");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = compositeFormat2.parseObject("");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test18");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("hi!", parsePosition6);
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test19");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = compositeFormat2.formatToCharacterIterator((java.lang.Object) (byte) 100);
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test20");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = null;
        java.text.Format format7 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat8 = new org.apache.commons.lang3.text.CompositeFormat(format6, format7);
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) compositeFormat2, format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test21");
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test22");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = compositeFormat2.format(obj3, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test23");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = compositeFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test24");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compositeFormat2.format((java.lang.Object) (short) 1);
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test25");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compositeFormat2.format((java.lang.Object) (short) 100);
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test26");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test27");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.lang.Class<?> wildcardClass6 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test29");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = compositeFormat2.format((java.lang.Object) (byte) 100, stringBuffer7, fieldPosition8);
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test30");
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test31");
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
            java.lang.String str9 = format7.format((java.lang.Object) false);
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test32");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = null;
        java.text.Format format4 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format3, format4);
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test33");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.text.Format format3 = null;
        java.text.Format format4 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat5 = new org.apache.commons.lang3.text.CompositeFormat(format3, format4);
        java.lang.Object obj6 = compositeFormat5.clone();
        java.text.Format format7 = compositeFormat5.getFormatter();
        java.text.Format format8 = compositeFormat5.getParser();
        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat(format1, (java.text.Format) compositeFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test34");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = compositeFormat2.format((java.lang.Object) 10, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test35");
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
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format7);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test36");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getParser();
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test37");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = compositeFormat2.formatToCharacterIterator((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test38");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = compositeFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test39");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = format5.format((java.lang.Object) (byte) 100);
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test40");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = compositeFormat2.format((java.lang.Object) 0L, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test41");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = format4.clone();
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test42");
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test43");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
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
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test44");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compositeFormat2.reformat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test45");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = format5.getClass();
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
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test46");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass6 = compositeFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test47");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
        java.lang.Object obj8 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test48");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test49");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = compositeFormat2.format((java.lang.Object) 100L, stringBuffer6, fieldPosition7);
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test50");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = compositeFormat2.formatToCharacterIterator((java.lang.Object) 1);
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test51");
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
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test52");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = compositeFormat2.formatToCharacterIterator((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test53");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.lang.Object obj5 = compositeFormat2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test54");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = format5.format((java.lang.Object) true);
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
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test55");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = format6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test56");
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
            java.lang.Class<?> wildcardClass8 = format7.getClass();
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test57");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getParser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test58");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.lang.Object obj5 = compositeFormat2.clone();
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
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test59");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = format5.formatToCharacterIterator((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test60");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.lang.Object obj4 = compositeFormat2.clone();
        java.text.Format format5 = compositeFormat2.getParser();
        java.text.Format format6 = compositeFormat2.getParser();
        java.text.Format format7 = compositeFormat2.getFormatter();
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
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test61");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = format5.format((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test62");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.text.Format format6 = compositeFormat2.getFormatter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format6);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeFormat0.test63");
        java.text.Format format0 = null;
        java.text.Format format1 = null;
        org.apache.commons.lang3.text.CompositeFormat compositeFormat2 = new org.apache.commons.lang3.text.CompositeFormat(format0, format1);
        java.lang.Object obj3 = compositeFormat2.clone();
        java.text.Format format4 = compositeFormat2.getFormatter();
        java.text.Format format5 = compositeFormat2.getFormatter();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = compositeFormat2.format((java.lang.Object) '4', stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(format5);
    }
}

