package FastDateFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FastDateFormat0 {

    public static boolean debug = false;

    @Test
    public void FastDateFormat0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0001");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.FULL;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void FastDateFormat0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0002");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.Class<?> wildcardClass3 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0003");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, (int) (short) -1, timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0004");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0005");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = fastDateFormat0.formatToCharacterIterator((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0006");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0007");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj3 = fastDateFormat0.parseObject("", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
    }

    @Test
    public void FastDateFormat0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0008");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0009");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0010");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0011");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.LONG;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void FastDateFormat0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0012");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0013");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0014");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) ' ', timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0015");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0016");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.MEDIUM;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void FastDateFormat0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0017");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) ' ', 1, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0018");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone4);
        java.lang.String str6 = fastDateFormat5.toString();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) str6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj9 = fastDateFormat2.parseObject("M/d/yy h:mm a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0019");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.util.Date date3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat0.format(date3, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0020");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void FastDateFormat0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0021");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format((java.lang.Object) 1.0d, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0022");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1), timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0023");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat0.format((java.lang.Object) 100.0d, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0024");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '4', (int) (byte) 0, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0025");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0026");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0027");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0028");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (-1));
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str6 = fastDateFormat0.format((java.lang.Object) fastDateFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void FastDateFormat0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0029");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, (int) '4', timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0030");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone4, locale5);
        java.lang.String str8 = fastDateFormat6.format((long) 100);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = fastDateFormat0.formatToCharacterIterator((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 5:00 PM" + "'", str8.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0031");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Calendar calendar1 = null;
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer3 = fastDateFormat0.format(calendar1, stringBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
    }

    @Test
    public void FastDateFormat0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0032");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        java.util.Date date3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat0.format(date3, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void FastDateFormat0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0033");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0034");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0035");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) (byte) 0, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0036");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat3.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"hi!\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void FastDateFormat0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0037");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat0.parse("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0038");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 5:00 PM", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0039");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0040");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0041");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 100, timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0042");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(10, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0043");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FastDateFormat0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0044");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, 21, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0045");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0046");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0047");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj7 = fastDateFormat2.parseObject("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0048");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat0.format((java.lang.Object) str6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0049");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, 2, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0050");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (byte) 10);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat3.parse("M/d/yy h:mm a", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void FastDateFormat0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0051");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0052");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) 'a', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0053");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        java.util.Calendar calendar3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat0.format(calendar3, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void FastDateFormat0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0054");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj3 = fastDateFormat0.parseObject("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0055");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone4);
        java.lang.String str6 = fastDateFormat5.toString();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) str6);
        java.lang.String str9 = fastDateFormat2.format((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "12/31/69 5:00 PM" + "'", str9.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0056");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass3 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0057");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.util.Date date4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str5 = fastDateFormat0.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0058");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj4 = fastDateFormat1.parseObject("MMMM d, yyyy h:mm:ss a z", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0059");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0060");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format((long) 10, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0061");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0062");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 10, timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0063");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, (int) (byte) 1, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0064");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("M/d/yy h:mm a", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0065");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0066");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date4 = fastDateFormat2.parse("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0067");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0068");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(100, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0069");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str4 = fastDateFormat2.format(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0070");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(100, (int) (short) 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0071");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 5:00 PM", timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0072");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0073");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str4 = fastDateFormat2.format((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0074");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) ' ', (int) 'a', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0075");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str7 = fastDateFormat2.format(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
    }

    @Test
    public void FastDateFormat0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0076");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, (int) 'a', timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0077");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0078");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(10L, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0079");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.Class<?> wildcardClass4 = fastDateFormat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void FastDateFormat0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0080");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.lang.Class<?> wildcardClass4 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void FastDateFormat0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0081");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '#', (int) (byte) 100, timeZone2, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0082");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator3 = fastDateFormat0.formatToCharacterIterator((java.lang.Object) fastDateFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0083");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj3 = fastDateFormat1.parseObject("h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0084");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(100, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0085");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format((long) (byte) 0, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0086");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) -1, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0087");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0088");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Class<?> wildcardClass3 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0089");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0090");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 100, (int) 'a', locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0091");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.SHORT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void FastDateFormat0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0092");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) 'a', timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0093");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("M/d/yy h:mm a", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0094");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0095");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Date date7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat3.format(date7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0096");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0097");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) ' ', locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0098");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date3 = fastDateFormat0.parse("FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[h:mm:ss a z,en_US,America/Denver]\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void FastDateFormat0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0099");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj8 = fastDateFormat3.parseObject("MMMM d, yyyy h:mm:ss a z", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0100");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat3.format((java.lang.Object) "h:mm:ss a z", stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0101");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0102");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.Class<?> wildcardClass3 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0103");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str4 = fastDateFormat2.format(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0104");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        java.util.Date date4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(date4, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0105");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) ' ', locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0106");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("MMMM d, yyyy h:mm:ss a z", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0107");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone1);
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str4 = fastDateFormat2.format(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0108");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat3.parse("h:mm:ss a z", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0109");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str5 = fastDateFormat0.format(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0110");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 100, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0111");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj5 = fastDateFormat3.parseObject("5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0112");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[h:mm:ss a z,en_US,America/Denver]\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0113");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str4 = fastDateFormat2.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0114");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0115");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = fastDateFormat3.formatToCharacterIterator((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0116");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj3 = fastDateFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0117");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format(calendar4, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0118");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format((long) (byte) 0, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0119");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj4 = fastDateFormat2.parseObject("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0120");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.util.Date date6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat3.format(date6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0121");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone7);
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0122");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Wednesday, December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0123");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Date date6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str7 = fastDateFormat2.format(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0124");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj5 = fastDateFormat3.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0125");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0126");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str5 = fastDateFormat0.format(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void FastDateFormat0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0127");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format(calendar6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0128");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat0.parse("12/31/69 5:00 PM", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0129");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format((java.lang.Object) 10L, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
    }

    @Test
    public void FastDateFormat0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0130");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format((long) 1, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0131");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("h:mm:ss a z", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0132");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (byte) 10);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat3.format((java.lang.Object) "5:00:00 PM MST", stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void FastDateFormat0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0133");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date5 = fastDateFormat3.parse("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0134");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) fastDateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void FastDateFormat0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0135");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str9 = fastDateFormat2.format((java.lang.Object) "h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0136");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 10, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0137");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date3 = fastDateFormat1.parse("5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"5:00:00 PM MST\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0138");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone4);
        java.lang.String str6 = fastDateFormat5.toString();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) str6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0139");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date4 = fastDateFormat2.parse("M/d/yy h:mm a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"M/d/yy h:mm a\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0140");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0141");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0142");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 10, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0143");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        java.util.Calendar calendar3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(calendar3, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0144");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0145");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str4 = fastDateFormat2.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0146");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("MMMM d, yyyy h:mm:ss a z", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0147");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) 'a', timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0148");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj8 = fastDateFormat2.parseObject("5:00:00 PM MST", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0149");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.lang.Class<?> wildcardClass4 = locale3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void FastDateFormat0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0150");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) -1, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0151");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 10, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0152");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0153");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str2 = fastDateFormat0.format(calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
    }

    @Test
    public void FastDateFormat0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0154");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale5);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str8 = fastDateFormat6.format(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0155");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str5 = fastDateFormat3.format((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0156");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0157");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((-1), timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0158");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0159");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', (int) (byte) -1, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0160");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat0.parse("h:mm:ss a z", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0161");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0162");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) (-1.0f));
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format((java.lang.Object) (short) 1, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void FastDateFormat0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0163");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone4);
        java.lang.String str6 = fastDateFormat5.toString();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) str6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0164");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str6 = fastDateFormat3.format(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0165");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0166");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 1);
        java.lang.Class<?> wildcardClass4 = fastDateFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void FastDateFormat0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0167");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str8 = fastDateFormat6.format(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0168");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(calendar4, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0169");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str6 = fastDateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0170");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj7 = fastDateFormat2.parseObject("FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0171");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str5 = fastDateFormat0.format((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void FastDateFormat0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0172");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj8 = fastDateFormat2.parseObject("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0173");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(calendar4, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0174");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0175");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone3, locale4);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat0.format((java.lang.Object) locale4, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void FastDateFormat0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0176");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0177");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale6);
        java.lang.String str9 = fastDateFormat8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str9.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0178");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0179");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), 0, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0180");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) -1, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0181");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"hi!\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0182");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0183");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str6 = fastDateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0184");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat3.format((long) (-1), stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0185");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat0.format((java.lang.Object) 10.0d, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0186");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat0.format(calendar4, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0187");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj7 = fastDateFormat3.parseObject("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0188");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat3.format((long) 2, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0189");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Date date8 = fastDateFormat3.parse("12/31/69 5:00 PM");
        java.lang.Class<?> wildcardClass9 = fastDateFormat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0190");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0191");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0192");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat3.parse("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0193");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 5:00 PM", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0194");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1), timeZone1, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0195");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) (-1.0f));
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format((java.lang.Object) "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void FastDateFormat0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0196");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat3.format(calendar7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0197");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat0.format((long) (short) 10, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0198");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str4 = fastDateFormat2.format(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0199");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, (int) (byte) -1, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0200");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0201");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0202");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0203");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0204");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0205");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date5 = fastDateFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0206");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5:00:00 PM MST" + "'", str6.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0207");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Calendar calendar3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(calendar3, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0208");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj4 = fastDateFormat0.parseObject("5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0209");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0210");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.TimeZone timeZone6 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0211");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) (short) 0, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0212");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5:00:00 PM MST" + "'", str6.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0213");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '#', (int) (short) -1, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0214");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0215");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) (-1.0f));
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str6 = fastDateFormat2.format(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void FastDateFormat0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0216");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 100, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0217");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format((long) (-1), stringBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0218");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0219");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0220");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone5, locale6);
        java.lang.String str8 = fastDateFormat7.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = fastDateFormat3.formatToCharacterIterator((java.lang.Object) str8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "M/d/yy h:mm a" + "'", str8.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0221");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        java.lang.Class<?> wildcardClass3 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0222");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format((java.lang.Object) (short) 100, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0223");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str6 = fastDateFormat0.format(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0224");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj8 = fastDateFormat2.parseObject("MMMM d, yyyy h:mm:ss a z", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
    }

    @Test
    public void FastDateFormat0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0225");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0226");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.lang.Object obj7 = fastDateFormat2.clone();
        java.lang.String str9 = fastDateFormat2.format((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "12/31/69 5:00 PM" + "'", str9.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0227");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 5:00 PM", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0228");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) -1, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0229");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0230");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0231");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969 4:59:59 PM MST", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0232");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"EEEE, MMMM d, yyyy\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0233");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0234");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, (int) (byte) 1, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0235");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat0.format(0L, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void FastDateFormat0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0236");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat2.parse("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0237");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1), timeZone5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0238");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0239");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0240");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0241");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0242");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str4 = fastDateFormat2.format(0L);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5:00:00 PM MST" + "'", str4.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0243");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, 21, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0244");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '4', locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0245");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("h:mm:ss a z", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0246");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 100, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0247");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj5 = fastDateFormat3.parseObject("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0248");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void FastDateFormat0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0249");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str6 = fastDateFormat0.format(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0250");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Wednesday, December 31, 1969", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0251");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat0.parse("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"EEEE, MMMM d, yyyy\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0252");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(10, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0253");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, (int) (short) 100, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0254");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str5 = fastDateFormat2.format(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0255");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, (-1), timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0256");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.lang.String str7 = fastDateFormat2.getPattern();
        java.lang.String str9 = fastDateFormat2.format((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h:mm:ss a z" + "'", str7.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "5:00:00 PM MST" + "'", str9.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0257");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 100, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0258");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 100, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0259");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str6 = fastDateFormat2.format(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0260");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.Object obj3 = fastDateFormat0.clone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj5 = fastDateFormat0.parseObject("Wednesday, December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0261");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0262");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str5 = fastDateFormat3.format(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0263");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0264");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 5:00 PM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0265");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0266");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.lang.String str7 = fastDateFormat5.format((long) 100);
        java.util.Locale locale8 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/31/69 5:00 PM" + "'", str7.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0267");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0268");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale5);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat6.parse("5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"5:00:00 PM MST\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0269");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', (int) (byte) 100, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0270");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        java.util.Date date7 = fastDateFormat5.parse("Wednesday, December 31, 1969");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format(date7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 31 00:00:00 MST 1969");
    }

    @Test
    public void FastDateFormat0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0271");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone4);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void FastDateFormat0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0272");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat0.parse("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"EEEE, MMMM d, yyyy\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0273");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), (int) (byte) 0, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0274");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 5:00 PM", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0275");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.lang.Object obj4 = fastDateFormat0.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = fastDateFormat0.formatToCharacterIterator((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0276");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, (int) ' ', timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0277");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale6);
        java.lang.Object obj8 = fastDateFormat7.clone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str9 = fastDateFormat3.format(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0278");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat0.parse("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0279");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format((java.lang.Object) 3, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0280");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '#', 10, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0281");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0282");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0283");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str6 = fastDateFormat2.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0284");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat0.format(calendar5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0285");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date3 = fastDateFormat1.parse("M/d/yy h:mm a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"M/d/yy h:mm a\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0286");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone6);
        java.lang.String str8 = fastDateFormat7.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = fastDateFormat3.formatToCharacterIterator((java.lang.Object) fastDateFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str8.equals("MMMM d, yyyy h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0287");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = fastDateFormat0.formatToCharacterIterator(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0288");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone6);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0289");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0290");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone4);
        java.lang.String str6 = fastDateFormat5.toString();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, (int) (short) 100, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0291");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format(calendar6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0292");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer4 = fastDateFormat0.format((long) (byte) -1, stringBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0293");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0294");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        java.util.Locale locale6 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) -1, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0295");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat2.parse("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0296");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.TimeZone timeZone4 = fastDateFormat0.getTimeZone();
        java.util.Locale locale5 = fastDateFormat0.getLocale();
        java.lang.Object obj6 = fastDateFormat0.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0297");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat0.format((long) ' ', stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0298");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat3.format(0L, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0299");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]", timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5:00:00 PM MST" + "'", str6.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0300");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 100, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0301");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '#', locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0302");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat3.parse("h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"h:mm:ss a z\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0303");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) -1, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0304");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("5:00:00 PM MST", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0305");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0306");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format((long) 2, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0307");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0308");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj8 = fastDateFormat2.parseObject("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0309");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.lang.Class<?> wildcardClass8 = fastDateFormat6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void FastDateFormat0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0310");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat0.format((long) (short) -1, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0311");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 12:00 AM", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0312");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(100, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0313");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) 'a', timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0314");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date3 = fastDateFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"hi!\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0315");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        java.util.Date date7 = fastDateFormat5.parse("Wednesday, December 31, 1969");
        java.lang.String str8 = fastDateFormat0.format(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 12:00 AM" + "'", str8.equals("12/31/69 12:00 AM"));
    }

    @Test
    public void FastDateFormat0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0316");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(10, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5:00:00 PM MST" + "'", str6.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0317");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0318");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj3 = fastDateFormat1.parseObject("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0319");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.lang.Object obj7 = fastDateFormat3.clone();
        java.lang.Object obj8 = fastDateFormat3.clone();
        java.lang.String str9 = fastDateFormat3.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "M/d/yy h:mm a" + "'", str9.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0320");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        java.util.Calendar calendar3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(calendar3, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0321");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a,en_US,America/Denver]", timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0322");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format((long) (byte) 10, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0323");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone3);
        java.lang.Class<?> wildcardClass5 = fastDateFormat4.getClass();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = fastDateFormat1.formatToCharacterIterator((java.lang.Object) fastDateFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void FastDateFormat0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0324");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969", timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0325");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2, locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0326");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.Object obj6 = fastDateFormat2.clone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMMM d, yyyy h:mm:ss a z\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0327");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.lang.String str7 = fastDateFormat4.toString();
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(100, (int) (short) -1, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0328");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0329");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0330");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale5);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format((long) (short) 100, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0331");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale5);
        java.lang.Object obj7 = null;
        boolean boolean8 = fastDateFormat6.equals(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void FastDateFormat0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0332");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0333");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format((java.lang.Object) fastDateFormat3, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0334");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat3.parse("MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMMM d, yyyy h:mm:ss a z\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0335");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0336");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 0, locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0337");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0338");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0339");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format((long) '4', stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0340");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.toString();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = fastDateFormat3.formatToCharacterIterator((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0341");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.lang.Class<?> wildcardClass4 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void FastDateFormat0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0342");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        java.lang.String str9 = fastDateFormat6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]" + "'", str9.equals("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0343");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format((long) 'a', stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0344");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone3, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) 'a', locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0345");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.lang.Class<?> wildcardClass6 = timeZone5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0346");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        java.lang.Class<?> wildcardClass7 = fastDateFormat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void FastDateFormat0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0347");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date4 = fastDateFormat2.parse("Wednesday, December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"Wednesday, December 31, 1969\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0348");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale6);
        int int9 = fastDateFormat8.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
    }

    @Test
    public void FastDateFormat0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0349");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator3 = fastDateFormat1.formatToCharacterIterator((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0350");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat0.format((long) (-1), stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void FastDateFormat0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0351");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj9 = fastDateFormat3.parseObject("h:mm:ss a z", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0352");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.lang.String str7 = fastDateFormat5.format((long) 100);
        java.util.Locale locale8 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', 10, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/31/69 5:00 PM" + "'", str7.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0353");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0354");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0355");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0356");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(20, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0357");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0358");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        java.lang.Class<?> wildcardClass8 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void FastDateFormat0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0359");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        java.lang.String str7 = fastDateFormat2.format((long) 3);
        java.lang.Class<?> wildcardClass8 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/31/69 5:00 PM" + "'", str7.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void FastDateFormat0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0360");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.lang.String str9 = fastDateFormat8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str9.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0361");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.Date date8 = fastDateFormat2.parse("12/31/69 12:00 AM");
        java.lang.Object obj9 = fastDateFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0362");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) -1, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0363");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0364");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format((java.lang.Object) ' ', stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0365");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date4 = fastDateFormat0.parse("5:00:00 PM MST", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void FastDateFormat0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0366");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 0);
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str4 = fastDateFormat2.format(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0367");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(20, (int) (byte) 0, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0368");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0369");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat0.parse("MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMMM d, yyyy h:mm:ss a z\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0370");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone7);
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0371");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(31, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0372");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date9 = fastDateFormat6.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0373");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 10, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0374");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0375");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj7 = fastDateFormat2.parseObject("FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0376");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("MMMM d, yyyy h:mm:ss a z", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void FastDateFormat0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0377");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(20, (int) ' ', timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0378");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.Class<?> wildcardClass5 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void FastDateFormat0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0379");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str6 = fastDateFormat3.format(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0380");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj3 = fastDateFormat1.parseObject("5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0381");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0382");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0383");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) (-1.0f));
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format(calendar5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void FastDateFormat0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0384");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format(calendar5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0385");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone4);
        boolean boolean6 = fastDateFormat0.equals((java.lang.Object) (byte) 0);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat0.format((long) (byte) 1, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void FastDateFormat0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0386");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date5 = fastDateFormat0.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0387");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0388");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj7 = fastDateFormat3.parseObject("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0389");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.lang.Class<?> wildcardClass9 = fastDateFormat8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0390");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0391");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.lang.String str4 = fastDateFormat0.toString();
        java.util.Date date6 = fastDateFormat0.parse("12/31/69 5:00 PM");
        java.util.Date date7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat0.format(date7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 31 17:00:00 MST 1969");
    }

    @Test
    public void FastDateFormat0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0392");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 10, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0393");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 12:00 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0394");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str5.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0395");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) (byte) 1, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0396");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat2.parse("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0397");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        java.lang.String str7 = fastDateFormat2.format((long) 3);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/31/69 5:00 PM" + "'", str7.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0398");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0399");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale6);
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0400");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date9 = fastDateFormat7.parse("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"EEEE, MMMM d, yyyy\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0401");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj9 = fastDateFormat2.parseObject("12/31/69 12:00 AM", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0402");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '4', timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0403");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str4 = fastDateFormat2.format(0L);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5:00:00 PM MST" + "'", str4.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0404");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0405");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.lang.Object obj7 = fastDateFormat5.clone();
        java.util.TimeZone timeZone8 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, (int) (byte) 1, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str6.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0406");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0407");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (short) 0);
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str4 = fastDateFormat2.format(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0408");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((-1), locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0409");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("5:00:00 PM MST", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0410");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0411");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, (-1), locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0412");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (-1));
        int int6 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.Object obj7 = fastDateFormat3.clone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str8 = fastDateFormat2.format((java.lang.Object) fastDateFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0413");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, (int) (short) -1, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0414");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str4 = fastDateFormat2.format(0L);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("12/31/69 5:00 PM", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5:00:00 PM MST" + "'", str4.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0415");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        java.lang.String str8 = fastDateFormat2.format((long) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 5:00 PM" + "'", str8.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0416");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0417");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale6);
        java.lang.Object obj9 = fastDateFormat8.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0418");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0419");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.lang.Object obj7 = fastDateFormat3.clone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date9 = fastDateFormat3.parse("M/d/yy h:mm a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"M/d/yy h:mm a\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0420");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat5.format(calendar7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h:mm:ss a z" + "'", str6.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0421");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat0.format(calendar5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0422");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.lang.Object obj7 = fastDateFormat5.clone();
        java.util.TimeZone timeZone8 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, (int) ' ', timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str6.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0423");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0424");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format(calendar4, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void FastDateFormat0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0425");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
    }

    @Test
    public void FastDateFormat0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0426");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.toString();
        java.lang.String str8 = fastDateFormat3.format((long) 100);
        java.lang.String str9 = fastDateFormat3.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 5:00 PM" + "'", str8.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "M/d/yy h:mm a" + "'", str9.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0427");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.lang.String str9 = fastDateFormat6.format((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "December 31, 1969" + "'", str9.equals("December 31, 1969"));
    }

    @Test
    public void FastDateFormat0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0428");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0429");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.Object obj5 = fastDateFormat0.clone();
        java.util.TimeZone timeZone6 = fastDateFormat0.getTimeZone();
        java.lang.String str8 = fastDateFormat0.format(10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 5:00 PM" + "'", str8.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0430");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 10, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0431");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.lang.Object obj7 = fastDateFormat3.clone();
        java.lang.String str8 = fastDateFormat3.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "M/d/yy h:mm a" + "'", str8.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0432");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) ' ', locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0433");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.String str3 = fastDateFormat2.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.lang.String str7 = fastDateFormat5.format((long) '#');
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "5:00:00 PM MST" + "'", str7.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0434");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '4', timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0435");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0436");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0437");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) (-1));
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat1.format((java.lang.Object) fastDateFormat2, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
    }

    @Test
    public void FastDateFormat0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0438");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        java.util.Date date7 = fastDateFormat5.parse("Wednesday, December 31, 1969");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat0.format(date7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 31 00:00:00 MST 1969");
    }

    @Test
    public void FastDateFormat0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0439");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.toString();
        java.lang.String str8 = fastDateFormat3.format((long) 100);
        int int9 = fastDateFormat3.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 5:00 PM" + "'", str8.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
    }

    @Test
    public void FastDateFormat0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0440");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0441");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj6 = fastDateFormat0.parseObject("M/d/yy h:mm a", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0442");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0443");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 10, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0444");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (byte) 10);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat3.parse("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void FastDateFormat0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0445");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void FastDateFormat0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0446");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0447");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone4);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 100, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void FastDateFormat0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0448");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0449");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        java.lang.Class<?> wildcardClass6 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0450");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969 4:59:59 PM MST");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0451");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0452");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format(calendar6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0453");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.Object obj5 = fastDateFormat0.clone();
        java.util.TimeZone timeZone6 = fastDateFormat0.getTimeZone();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str8 = fastDateFormat0.format(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0454");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 0);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat1.parse("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Dec 31, 1969" + "'", str3.equals("Dec 31, 1969"));
    }

    @Test
    public void FastDateFormat0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0455");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        java.lang.String str7 = fastDateFormat2.format((long) 3);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str9 = fastDateFormat2.format(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/31/69 5:00 PM" + "'", str7.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0456");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0457");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((-1), timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0458");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0459");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0460");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0461");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        boolean boolean5 = fastDateFormat2.equals((java.lang.Object) str4);
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, 10, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0462");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.lang.String str3 = fastDateFormat0.format(0L);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str7 = fastDateFormat5.format(1L);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = fastDateFormat0.formatToCharacterIterator((java.lang.Object) fastDateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "12/31/69 5:00 PM" + "'", str3.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Wednesday, December 31, 1969" + "'", str7.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0463");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(100, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0464");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 100, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0465");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format(calendar7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0466");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone6);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date9 = fastDateFormat7.parse("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[MMMM d, yyyy,en_US,America/Denver]\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0467");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(100, (int) 'a', timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0468");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.lang.String str5 = fastDateFormat0.getPattern();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat0.format(calendar6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0469");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, (int) (short) 100, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0470");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(14, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0471");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat2.parse("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void FastDateFormat0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0472");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '#', locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0473");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5:00:00 PM MST" + "'", str6.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0474");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0475");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0476");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6);
        java.lang.Class<?> wildcardClass8 = fastDateFormat7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void FastDateFormat0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0477");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0478");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0479");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z");
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0480");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0481");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date5 = fastDateFormat3.parse("12/31/69 5:00 PM");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"12/31/69 5:00 PM\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0482");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date9 = fastDateFormat3.parse("5:00:00 PM MST", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0483");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.lang.String str6 = fastDateFormat4.format((long) 100);
        java.lang.String str7 = fastDateFormat4.getPattern();
        java.util.Locale locale8 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) -1, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 5:00 PM" + "'", str6.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "M/d/yy h:mm a" + "'", str7.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0484");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date3 = fastDateFormat1.parse("December 31, 1969 4:59:59 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"December 31, 1969 4:59:59 PM MST\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0485");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0486");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format(calendar6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0487");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str8 = fastDateFormat2.format((java.lang.Object) "h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0488");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        int int3 = fastDateFormat0.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date6 = fastDateFormat0.parse("December 31, 1969 4:59:59 PM MST", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void FastDateFormat0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0489");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.Object obj7 = fastDateFormat3.parseObject("December 31, 1969 4:59:59 PM MST", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0490");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0491");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0492");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z");
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.String str3 = fastDateFormat1.format(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0493");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) ' ', timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0494");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z");
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0495");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0496");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0497");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.Locale locale8 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(13, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5:00:00 PM MST" + "'", str6.equals("5:00:00 PM MST"));
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
    public void FastDateFormat0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0498");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale5);
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.util.Date date8 = fastDateFormat6.parse("12/31/69 12:00 AM");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"12/31/69 12:00 AM\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0499");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.FastDateFormat0500");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

