
package FastDateFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FastDateFormat1 {

    public static boolean debug = false;

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0501");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0502");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone2, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(100, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0503");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0504");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.util.Locale locale8 = fastDateFormat6.getLocale();
        java.util.Locale locale9 = fastDateFormat6.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0505");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0506");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        int int8 = fastDateFormat6.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0507");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, (int) (short) 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0508");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = fastDateFormat0.equals(obj2);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale5);
        java.util.Date date8 = fastDateFormat6.parse("Wednesday, December 31, 1969");
        java.lang.String str9 = fastDateFormat0.format(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "12/31/69 12:00 AM" + "'", str9.equals("12/31/69 12:00 AM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0509");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.TimeZone timeZone6 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0510");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, 2, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0511");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0512");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Date date4 = fastDateFormat2.parse("Wednesday, December 31, 1969");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format((long) 13, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Wed Dec 31 00:00:00 MST 1969");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0513");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) ' ', locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0514");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 1);
        java.lang.Class<?> wildcardClass6 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0515");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0516");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Date date8 = fastDateFormat3.parse("12/31/69 5:00 PM");
        java.lang.Object obj9 = fastDateFormat3.clone();
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
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0517");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) -1, (int) (short) 1, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0518");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format(calendar5, stringBuffer6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0519");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) -1, locale5);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0520");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.lang.String str8 = fastDateFormat5.format((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat2.format((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Wednesday, December 31, 1969" + "'", str8.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0521");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0522");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = fastDateFormat0.equals(obj2);
        java.lang.String str5 = fastDateFormat0.format((long) (byte) 0);
        java.lang.Class<?> wildcardClass6 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0523");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 0);
        java.lang.Class<?> wildcardClass4 = fastDateFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Dec 31, 1969" + "'", str3.equals("Dec 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0524");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0525");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) ' ', timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0526");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969 4:59:59 PM MST", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0527");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str5 = fastDateFormat3.format((long) (short) 1);
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat3);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat3.format(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0528");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0529");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fastDateFormat1.parseObject("December 31, 1969 4:59:59 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0530");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.util.Date date7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format(date7, stringBuffer8);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0531");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"EEEE, MMMM d, yyyy\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0532");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) 'a', locale5);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0533");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.lang.String str9 = fastDateFormat6.format((long) 14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "December 31, 1969" + "'", str9.equals("December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0534");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        java.lang.Object obj7 = fastDateFormat6.clone();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        java.util.Locale locale9 = fastDateFormat6.getLocale();
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
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0535");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0536");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat3.format(calendar5, stringBuffer6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0537");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0538");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Class<?> wildcardClass3 = fastDateFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MMM d, yyyy" + "'", str2.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0539");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.TimeZone timeZone4 = fastDateFormat0.getTimeZone();
        java.lang.String str5 = fastDateFormat0.toString();
        java.util.Date date6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat0.format(date6, stringBuffer7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0540");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = fastDateFormat2.format(calendar4);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0541");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0542");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        int int3 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat0.parseObject("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", parsePosition6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0543");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat0.format(0L, stringBuffer5);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0544");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = fastDateFormat2.format(calendar7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0545");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0546");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.TimeZone timeZone4 = fastDateFormat0.getTimeZone();
        java.lang.String str5 = fastDateFormat0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat0.parse("M/d/yy h:mm a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"M/d/yy h:mm a\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
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
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0547");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.lang.Object obj7 = fastDateFormat2.clone();
        java.util.Locale locale8 = fastDateFormat2.getLocale();
        int int9 = fastDateFormat2.getMaxLengthEstimate();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0548");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat3.parse("h:mm:ss a z", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0549");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        int int7 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.String str8 = fastDateFormat3.toString();
        java.lang.Class<?> wildcardClass9 = fastDateFormat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str8.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0550");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0551");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        java.lang.String str4 = fastDateFormat1.getPattern();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format((long) 0, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0552");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(17, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0553");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMM d, yyyy,en_US,America/Denver]", timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0554");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0555");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0556");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0557");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 10, locale4);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0558");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0559");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format((java.lang.Object) 100.0f, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0560");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str4 = fastDateFormat1.format((-1L));
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = fastDateFormat1.format(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wednesday, December 31, 1969" + "'", str4.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0561");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '4', timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0562");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat7.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
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
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0563");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat3.format((java.lang.Object) 0.0f, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0564");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat0.parse("December 31, 1969 4:59:59 PM MST", parsePosition4);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0565");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str5 = fastDateFormat3.format((long) (short) 1);
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat1.parse("12/31/69 5:00 PM");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"12/31/69 5:00 PM\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0566");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        java.util.Locale locale4 = fastDateFormat1.getLocale();
        java.lang.Object obj5 = fastDateFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0567");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = fastDateFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0568");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str6 = fastDateFormat2.format((long) (short) -1);
        java.lang.String str8 = fastDateFormat2.format(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 4:59 PM" + "'", str6.equals("12/31/69 4:59 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 5:00 PM" + "'", str8.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0569");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.util.Locale locale5 = fastDateFormat0.getLocale();
        int int6 = fastDateFormat0.getMaxLengthEstimate();
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
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0570");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '4', locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0571");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0572");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0573");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat0.format((java.lang.Object) timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: sun.util.calendar.ZoneInfo");
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
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0574");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969 4:59:59 PM MST", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0575");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.lang.Class<?> wildcardClass7 = fastDateFormat5.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0576");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = fastDateFormat1.parse("FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[h:mm:ss a z,en_US,America/Denver]\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0577");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.Class<?> wildcardClass3 = fastDateFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0578");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str4 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0579");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '4', timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0580");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.lang.String str5 = fastDateFormat0.getPattern();
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat0.format(date6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0581");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone7);
        java.lang.String str9 = fastDateFormat8.getPattern();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str9.equals("MMMM d, yyyy h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0582");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.Object obj3 = fastDateFormat0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0583");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.lang.String str5 = fastDateFormat0.getPattern();
        java.lang.Class<?> wildcardClass6 = fastDateFormat0.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0584");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0585");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 4:59 PM", timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0586");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0587");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 10, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0588");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.lang.Class<?> wildcardClass9 = locale6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0589");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str4 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0590");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) (-1.0f));
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        boolean boolean8 = fastDateFormat2.equals((java.lang.Object) fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0591");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str4 = fastDateFormat2.format(0L);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format(calendar6, stringBuffer7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0592");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 1);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format((long) (byte) 0, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0593");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat3.parseObject("M/d/yy h:mm a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0594");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format((long) 32, stringBuffer7);
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
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0595");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 12:00 AM", locale7);
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0596");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = fastDateFormat2.format(calendar7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0597");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.lang.String str7 = fastDateFormat3.format((long) (short) -1);
        java.lang.String str8 = fastDateFormat3.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "December 31, 1969 4:59:59 PM MST" + "'", str7.equals("December 31, 1969 4:59:59 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str8.equals("MMMM d, yyyy h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0598");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0599");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.util.Calendar calendar3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0600");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format(calendar5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0601");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat3.format(calendar6);
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0602");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale5);
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0603");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 100, 13, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0604");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        java.lang.String str4 = fastDateFormat1.format((long) (short) 10);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format((long) 2, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5:00:00 PM MST" + "'", str4.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0605");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0606");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat2.format((java.lang.Object) "h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0607");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.Date date6 = fastDateFormat4.parse("Wednesday, December 31, 1969");
        java.lang.String str7 = fastDateFormat0.format(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat0.format((java.lang.Object) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/31/69 12:00 AM" + "'", str7.equals("12/31/69 12:00 AM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0608");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0609");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        java.lang.Object obj7 = fastDateFormat6.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0610");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 1);
        java.util.TimeZone timeZone4 = fastDateFormat1.getTimeZone();
        java.lang.Class<?> wildcardClass5 = timeZone4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0611");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0612");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 100, locale6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0613");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0614");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 100, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0615");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format(calendar5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0616");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone6);
        java.lang.String str8 = fastDateFormat7.toString();
        boolean boolean9 = fastDateFormat2.equals((java.lang.Object) fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str8.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0617");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = fastDateFormat2.format(calendar7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0618");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(14, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0619");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0620");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 5:00 PM", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str5.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0621");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fastDateFormat1.parseObject("FastDateFormat[h:mm:ss a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0622");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        java.lang.String str9 = fastDateFormat2.format((long) 1);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "5:00:00 PM MST" + "'", str9.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0623");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0624");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0625");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMM d, yyyy,en_US,America/Denver]", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0626");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fastDateFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0627");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0628");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a", timeZone7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0629");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat3.format(calendar8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0630");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat5.parse("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"EEEE, MMMM d, yyyy\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str6.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0631");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(17, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0632");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0633");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("12/31/69 12:00 AM", parsePosition7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0634");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("MMMM d, yyyy h:mm:ss a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMMM d, yyyy h:mm:ss a\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0635");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0636");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = fastDateFormat2.parse("12/31/69 4:59 PM");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"12/31/69 4:59 PM\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0637");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0638");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0639");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str2 = fastDateFormat1.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        boolean boolean6 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.lang.String str8 = fastDateFormat5.format((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MMM d, yyyy" + "'", str2.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Dec 31, 1969 4:59:59 PM MST" + "'", str8.equals("Dec 31, 1969 4:59:59 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0640");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.lang.String str9 = fastDateFormat6.format((long) (byte) 0);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0641");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0642");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0643");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat6.parseObject("12/31/69 12:00 AM", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0644");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat3.format((long) (byte) 10, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0645");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, (int) ' ', timeZone2, locale5);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0646");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.lang.String str6 = fastDateFormat4.format((long) 100);
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 5:00 PM" + "'", str6.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0647");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone6);
        java.lang.Class<?> wildcardClass9 = fastDateFormat8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0648");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '4', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0649");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.lang.Object obj4 = fastDateFormat0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat0.parseObject("December 31, 1969 4:59:59 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0650");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        int int7 = fastDateFormat2.getMaxLengthEstimate();
        int int8 = fastDateFormat2.getMaxLengthEstimate();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0651");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), (int) (byte) -1, locale6);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0652");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), (int) (byte) -1, locale7);
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0653");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone6);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat7.format(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0654");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0655");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0656");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(13, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0657");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fastDateFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0658");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0659");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        java.lang.Class<?> wildcardClass8 = timeZone7.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0660");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((-1), locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0661");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0662");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (byte) 10);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat3.format((long) '#', stringBuffer7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0663");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 4:59 PM", timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0664");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone1, locale6);
        java.lang.Object obj8 = fastDateFormat7.clone();
        java.lang.Object obj9 = fastDateFormat7.clone();
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
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0665");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat1.parse("December 31, 1969 4:59:59 PM MST", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0666");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        java.util.Locale locale6 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0667");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0668");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str3 = fastDateFormat1.getPattern();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.lang.String str5 = fastDateFormat1.toString();
        java.util.Date date7 = fastDateFormat1.parse("12/31/69 5:00 PM");
        java.util.TimeZone timeZone8 = fastDateFormat1.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 31 17:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0669");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.lang.String str3 = fastDateFormat1.format((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0670");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0671");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        java.lang.String str3 = fastDateFormat1.format(100L);
        java.lang.Object obj4 = fastDateFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0672");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 1);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale5);
        java.lang.String str8 = fastDateFormat6.format((long) (short) 1);
        boolean boolean9 = fastDateFormat1.equals((java.lang.Object) fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Wednesday, December 31, 1969" + "'", str8.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0673");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969 4:59:59 PM MST");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0674");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969 4:59:59 PM MST", locale5);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0675");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat3.parse("December 31, 1969", parsePosition6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0676");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.String str3 = fastDateFormat0.getPattern();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat0.format((long) (byte) 1, stringBuffer5);
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0677");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0678");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat3.parseObject("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0679");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        boolean boolean4 = fastDateFormat1.equals((java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0680");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.getPattern();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat3.format(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str5.equals("MMMM d, yyyy h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0681");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale6);
        java.lang.Class<?> wildcardClass9 = locale6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0682");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        boolean boolean6 = fastDateFormat4.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '4', (int) (short) 10, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0683");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("FastDateFormat[h:mm:ss a,en_US,America/Denver]", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MMMM d, yyyy h:mm:ss a" + "'", str3.equals("MMMM d, yyyy h:mm:ss a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0684");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format(calendar4, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0685");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat3.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0686");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = fastDateFormat1.formatToCharacterIterator((java.lang.Object) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str6.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0687");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0688");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        java.util.Date date7 = fastDateFormat5.parse("Wednesday, December 31, 1969");
        java.lang.String str8 = fastDateFormat1.format(date7);
        int int9 = fastDateFormat1.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0689");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0690");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        java.lang.String str7 = fastDateFormat2.format((long) 3);
        java.util.TimeZone timeZone8 = fastDateFormat2.getTimeZone();
        java.lang.Class<?> wildcardClass9 = timeZone8.getClass();
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
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0691");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) -1, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0692");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        int int5 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.Object obj6 = fastDateFormat1.clone();
        java.util.TimeZone timeZone7 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0693");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("M/d/yy h:mm a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0694");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.util.Locale locale5 = fastDateFormat0.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat0.parse("M/d/yy h:mm a", parsePosition7);
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
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0695");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0696");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.lang.Object obj3 = fastDateFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0697");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0698");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0699");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '4', (int) '4', timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0700");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        java.util.Locale locale6 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((-1), locale6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0701");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 1);
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 4:59 PM", timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wednesday, December 31, 1969" + "'", str4.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0702");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.String str3 = fastDateFormat0.getPattern();
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat0.format(calendar4, stringBuffer5);
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0703");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fastDateFormat0.parseObject("M/d/yy h:mm a");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0704");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fastDateFormat1.parseObject("MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0705");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        java.lang.String str7 = fastDateFormat3.toString();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Wednesday, December 31, 1969", timeZone8);
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
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0706");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str4 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0707");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(17, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0708");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.util.TimeZone timeZone5 = fastDateFormat0.getTimeZone();
        int int6 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.Class<?> wildcardClass7 = fastDateFormat0.getClass();
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
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0709");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str5 = fastDateFormat3.format((long) (short) 1);
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat3);
        java.lang.Class<?> wildcardClass8 = fastDateFormat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0710");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        java.lang.String str4 = fastDateFormat1.format((long) (short) 10);
        java.lang.String str5 = fastDateFormat1.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5:00:00 PM MST" + "'", str4.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h:mm:ss a z" + "'", str5.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0711");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        java.lang.String str7 = fastDateFormat6.toString();
        java.util.Locale locale8 = fastDateFormat6.getLocale();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0712");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str4 = fastDateFormat2.format((long) 0);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale5);
        java.lang.String str7 = fastDateFormat6.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5:00:00 PM MST" + "'", str4.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str7.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0713");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone7);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]" + "'", str9.equals("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0714");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(0L, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0715");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969 4:59:59 PM MST", timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0716");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fastDateFormat0.format(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0717");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(32, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0718");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0719");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0720");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0721");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        java.lang.String str3 = fastDateFormat1.format(100L);
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = fastDateFormat1.format(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0722");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1), timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0723");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = fastDateFormat0.equals((java.lang.Object) fastDateFormat4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat4.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0724");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, (int) 'a', timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0725");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.lang.Object obj8 = fastDateFormat6.clone();
        java.lang.String str9 = fastDateFormat6.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MMMM d, yyyy" + "'", str9.equals("MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0726");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0727");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat2.parseObject("12/31/69 4:59 PM", parsePosition7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0728");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(31, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 31");
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0729");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6);
        int int8 = fastDateFormat7.getMaxLengthEstimate();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0730");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("5:00:00 PM MST", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0731");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, 1, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0732");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat2.parseObject("EEEE, MMMM d, yyyy", parsePosition8);
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0733");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.lang.String str8 = fastDateFormat6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]" + "'", str8.equals("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0734");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = fastDateFormat0.parse("MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMMM d, yyyy h:mm:ss a z\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0735");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("M/d/yy h:mm a", parsePosition7);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0736");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str6 = fastDateFormat2.format((long) (short) -1);
        java.lang.String str7 = fastDateFormat2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 4:59 PM" + "'", str6.equals("12/31/69 4:59 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0737");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("FastDateFormat[h:mm:ss a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0738");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0739");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone4);
        boolean boolean6 = fastDateFormat0.equals((java.lang.Object) (byte) 0);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat0.parse("EEEE, MMMM d, yyyy", parsePosition8);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0740");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0741");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, locale6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0742");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 2);
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format(calendar7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0743");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 0);
        java.lang.String str4 = fastDateFormat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Dec 31, 1969" + "'", str3.equals("Dec 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[MMM d, yyyy,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[MMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0744");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0745");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.String str3 = fastDateFormat2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0746");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0747");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(13, 3, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0748");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, 0, timeZone4, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
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
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0749");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fastDateFormat1.parseObject("M/d/yy h:mm a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0750");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '4', locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0751");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone7);
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
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0752");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0753");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone5);
        java.lang.String str7 = fastDateFormat6.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) str7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h:mm:ss a z" + "'", str7.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0754");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("Dec 31, 1969");
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0755");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8);
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
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0756");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat2.parse("December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"December 31, 1969\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0757");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0758");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format(calendar4, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MMMM d, yyyy h:mm:ss a" + "'", str3.equals("MMMM d, yyyy h:mm:ss a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0759");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.lang.String str6 = fastDateFormat4.format((long) 100);
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("5:00:00 PM MST", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 5:00 PM" + "'", str6.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0760");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0761");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = fastDateFormat0.equals(obj2);
        java.lang.String str5 = fastDateFormat0.format((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat0.parse("Wednesday, December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"Wednesday, December 31, 1969\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0762");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format(1L);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat1.parse("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0763");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.lang.String str7 = fastDateFormat5.format((long) 100);
        java.util.Locale locale8 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(17, 3, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0764");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 10, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0765");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, (int) '#', timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0766");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str2 = fastDateFormat1.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        boolean boolean6 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat1.parseObject("Dec 31, 1969 4:59:59 PM MST", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MMM d, yyyy" + "'", str2.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0767");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) -1, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0768");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
        int int7 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.Object obj8 = fastDateFormat2.clone();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0769");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.TimeZone timeZone6 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '4', timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0770");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), (int) (byte) 0, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0771");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = fastDateFormat1.parse("MMMM d, yyyy h:mm:ss a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMMM d, yyyy h:mm:ss a\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0772");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        boolean boolean4 = fastDateFormat1.equals((java.lang.Object) str3);
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.Locale locale6 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat7.parseObject("Wednesday, December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0773");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str4 = fastDateFormat2.format((long) 0);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat6.parseObject("FastDateFormat[MMM d, yyyy,en_US,America/Denver]", parsePosition8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0774");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format((long) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0775");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 1);
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) -1, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wednesday, December 31, 1969" + "'", str4.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0776");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fastDateFormat2.parseObject("December 31, 1969 4:59:59 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0777");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 32, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0778");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.Object obj5 = fastDateFormat2.clone();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
        int int7 = fastDateFormat2.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0779");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.String str3 = fastDateFormat0.getPattern();
        java.util.TimeZone timeZone5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = fastDateFormat0.formatToCharacterIterator((java.lang.Object) timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: sun.util.calendar.ZoneInfo");
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0780");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, locale6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0781");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, locale6);
        java.lang.Class<?> wildcardClass8 = locale6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0782");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0783");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 100, timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0784");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.Object obj5 = fastDateFormat3.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = fastDateFormat3.format((java.lang.Object) fastDateFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0785");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0786");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str4 = fastDateFormat1.format((-1L));
        java.lang.String str5 = fastDateFormat1.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat1.parseObject("MMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wednesday, December 31, 1969" + "'", str4.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0787");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0788");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone3, locale4);
        java.lang.Object obj6 = fastDateFormat5.clone();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 100, (int) ' ', timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0789");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 14, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0790");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        java.lang.String str4 = fastDateFormat1.format((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Dec 31, 1969" + "'", str4.equals("Dec 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0791");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Date date8 = fastDateFormat3.parse("12/31/69 4:59 PM");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 16:59:00 MST 1969");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0792");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.lang.String str6 = fastDateFormat4.format((long) 100);
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 5:00 PM" + "'", str6.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0793");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 100, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0794");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = fastDateFormat2.format(date4);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0795");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0796");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat3.parse("December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"December 31, 1969\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0797");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0798");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        java.lang.String str4 = fastDateFormat1.getPattern();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format((long) '4', stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0799");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) ' ', timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0800");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]", timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0801");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) 'a', timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0802");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.lang.String str7 = fastDateFormat5.format((long) 100);
        java.util.Locale locale8 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, 0, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0803");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat0.parse("5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"5:00:00 PM MST\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0804");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format((long) (byte) -1, stringBuffer8);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0805");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.lang.String str5 = fastDateFormat3.toString();
        java.lang.String str7 = fastDateFormat3.format((long) 1);
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Wednesday, December 31, 1969" + "'", str7.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0806");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) 'a', timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MMM d, yyyy" + "'", str3.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MMM d, yyyy" + "'", str5.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0807");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0808");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.lang.Object obj5 = fastDateFormat0.clone();
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0809");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.lang.Object obj8 = fastDateFormat1.clone();
        java.lang.Class<?> wildcardClass9 = fastDateFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str6.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0810");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) "MMMM d, yyyy");
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat2.format(calendar8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0811");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) '4', locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMM d, yyyy" + "'", str4.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MMM d, yyyy" + "'", str6.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0812");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fastDateFormat0.parseObject("12/31/69 5:00 PM", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0813");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.lang.Object obj5 = fastDateFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0814");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.lang.String str4 = fastDateFormat0.toString();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat0.parse("Dec 31, 1969 5:00:00 PM MST", parsePosition6);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0815");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        java.lang.Class<?> wildcardClass7 = fastDateFormat6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0816");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format((long) (short) 100, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0817");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.Class<?> wildcardClass6 = fastDateFormat2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0818");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0819");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, (int) (byte) 0, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMM d, yyyy" + "'", str4.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MMM d, yyyy" + "'", str6.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0820");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1), locale6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0821");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(14, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0822");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0823");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0824");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("5:00:00 PM MST", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0825");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        java.lang.Class<?> wildcardClass2 = fastDateFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0826");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.lang.String str8 = fastDateFormat6.getPattern();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MMMM d, yyyy" + "'", str8.equals("MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0827");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(14, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0828");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.lang.Object obj7 = fastDateFormat4.clone();
        java.util.Locale locale8 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3, locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0829");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str5 = fastDateFormat3.format((long) 0);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a", locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0830");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = fastDateFormat2.format(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0831");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat1.format((long) (byte) 0, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0832");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.Object obj6 = fastDateFormat4.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat3.format(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0833");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0834");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat2.format(date6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0835");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 1);
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(13, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wednesday, December 31, 1969" + "'", str4.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0836");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969 5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0837");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) '#', locale5);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0838");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 1);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = fastDateFormat2.formatToCharacterIterator(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wednesday, December 31, 1969" + "'", str4.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0839");
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone4, locale5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 1, locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0840");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        boolean boolean4 = fastDateFormat0.equals((java.lang.Object) "M/d/yy h:mm a");
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat0.format(calendar5, stringBuffer6);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0841");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(31, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0842");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("5:00:00 PM MST", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0843");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("Dec 31, 1969 4:59:59 PM MST", parsePosition7);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0844");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat5.parse("Wednesday, December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"Wednesday, December 31, 1969\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
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
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0845");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str7 = fastDateFormat6.getPattern();
        java.lang.Object obj8 = fastDateFormat6.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat2.format(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "M/d/yy h:mm a" + "'", str7.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0846");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        boolean boolean4 = fastDateFormat1.equals((java.lang.Object) str3);
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.Locale locale6 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        java.lang.String str8 = fastDateFormat7.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "h:mm:ss a z" + "'", str8.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0847");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) ' ', (int) (short) 100, locale6);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0848");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(100, locale5);
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
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0849");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 0);
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Dec 31, 1969" + "'", str4.equals("Dec 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[MMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0850");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat3.parseObject("Wednesday, December 31, 1969", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0851");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(32, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0852");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(31, 14, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0853");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969 5:00:00 PM MST", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0854");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = fastDateFormat0.equals(obj2);
        java.lang.String str5 = fastDateFormat0.format((long) (byte) 0);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.lang.Object obj8 = fastDateFormat7.clone();
        boolean boolean9 = fastDateFormat0.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0855");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("MMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMM d, yyyy\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0856");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        java.util.Date date3 = fastDateFormat1.parse("December 31, 1969");
        java.lang.String str5 = fastDateFormat1.format((long) (byte) 100);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat1.parseObject("EEEE, MMMM d, yyyy", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Dec 31, 1969" + "'", str5.equals("Dec 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0857");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0858");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0859");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.lang.String str5 = fastDateFormat3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0860");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Date date6 = fastDateFormat3.parse("12/31/69 12:00 AM");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 31 00:00:00 MST 1969");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0861");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0862");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0863");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, locale6);
        java.lang.String str8 = fastDateFormat7.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "EEEE, MMMM d, yyyy h:mm:ss a z" + "'", str8.equals("EEEE, MMMM d, yyyy h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0864");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fastDateFormat2.parseObject("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0865");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.String str7 = fastDateFormat4.format(0L);
        java.util.Locale locale8 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '4', 3, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h:mm:ss a z" + "'", str5.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "5:00:00 PM MST" + "'", str7.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0866");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(13, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MMM d, yyyy" + "'", str3.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MMM d, yyyy" + "'", str5.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0867");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat2.parse("5:00:00 PM MST", parsePosition8);
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0868");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.lang.String str5 = fastDateFormat3.format((long) (short) 1);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat1.format((java.lang.Object) str5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "December 31, 1969" + "'", str5.equals("December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0869");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat0.parseObject("Dec 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0870");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0871");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        int int5 = fastDateFormat1.getMaxLengthEstimate();
        int int6 = fastDateFormat1.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0872");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        java.lang.String str7 = fastDateFormat6.toString();
        int int8 = fastDateFormat6.getMaxLengthEstimate();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0873");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        java.lang.String str7 = fastDateFormat5.format((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat5.parseObject("December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "5:00:00 PM MST" + "'", str7.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0874");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0875");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format((long) (byte) 1, stringBuffer5);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0876");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.TimeZone timeZone6 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 10, timeZone6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0877");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) fastDateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0878");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 4:59 PM", timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0879");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        boolean boolean6 = fastDateFormat4.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 2, locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0880");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat3.format(calendar5, stringBuffer6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0881");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0882");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat2.parse("5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"5:00:00 PM MST\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0883");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy", timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0884");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0885");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 3);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]", timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0886");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 0);
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969 5:00:00 PM MST", timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Dec 31, 1969" + "'", str4.equals("Dec 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[MMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0887");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat7.format(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0888");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0889");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 100, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0890");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0891");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.lang.String str8 = fastDateFormat3.format((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 5:00 PM" + "'", str8.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0892");
        java.util.TimeZone timeZone2 = null;
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.lang.Object obj7 = fastDateFormat5.clone();
        java.util.Locale locale8 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(32, (int) '#', timeZone2, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str6.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0893");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        java.lang.Object obj7 = fastDateFormat6.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat6.parseObject("M/d/yy h:mm a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0894");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0);
        java.lang.Class<?> wildcardClass3 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0895");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        boolean boolean6 = fastDateFormat2.equals((java.lang.Object) 10L);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0896");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("MMMM d, yyyy", parsePosition6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0897");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale6);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0898");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        boolean boolean6 = fastDateFormat2.equals((java.lang.Object) locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"h:mm:ss a z\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0899");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(32, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0900");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fastDateFormat0.parseObject("MMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0901");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.lang.String str6 = fastDateFormat2.getPattern();
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = fastDateFormat2.format(date7);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h:mm:ss a z" + "'", str6.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0902");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        int int4 = fastDateFormat1.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17 + "'", int4 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0903");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0904");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat6.parseObject("", parsePosition8);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0905");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(13, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0906");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Date date4 = fastDateFormat2.parse("Wednesday, December 31, 1969");
        java.lang.Class<?> wildcardClass5 = date4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0907");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy", timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0908");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.format((long) 13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0909");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.lang.String str5 = fastDateFormat0.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat0.parseObject("December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0910");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.String str2 = fastDateFormat1.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = fastDateFormat1.formatToCharacterIterator((java.lang.Object) fastDateFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0911");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat3.parse("FastDateFormat[h:mm:ss a,en_US,America/Denver]", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0912");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(10, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0913");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0914");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        int int5 = fastDateFormat0.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat0.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat0.parse("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[MMMM d, yyyy,en_US,America/Denver]\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0915");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale5);
        java.lang.Class<?> wildcardClass7 = locale5.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0916");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        boolean boolean8 = fastDateFormat2.equals((java.lang.Object) (short) 1);
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
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0917");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.util.Calendar calendar3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0918");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        boolean boolean5 = fastDateFormat2.equals((java.lang.Object) str4);
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969 4:59:59 PM MST", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0919");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone7);
        java.lang.String str9 = fastDateFormat8.getPattern();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "h:mm:ss a z" + "'", str9.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0920");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat2.parse("MMM d, yyyy", parsePosition8);
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
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0921");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = fastDateFormat1.parse("Dec 31, 1969 4:59:59 PM MST", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0922");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.String str3 = fastDateFormat0.format(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "12/31/69 5:00 PM" + "'", str3.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0923");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.util.Locale locale8 = fastDateFormat6.getLocale();
        java.lang.Class<?> wildcardClass9 = fastDateFormat6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0924");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str7 = fastDateFormat3.format((long) 31);
        java.lang.String str9 = fastDateFormat3.format((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Wednesday, December 31, 1969" + "'", str7.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Wednesday, December 31, 1969" + "'", str9.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0925");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format((long) (-1), stringBuffer8);
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
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0926");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone6);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0927");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.Locale locale8 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 10, locale8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0928");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0929");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale6);
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0930");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat5.parse("Wednesday, December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"Wednesday, December 31, 1969\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0931");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 0);
        java.lang.Object obj4 = fastDateFormat1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Dec 31, 1969" + "'", str3.equals("Dec 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[MMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0932");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.lang.String str7 = fastDateFormat2.getPattern();
        int int8 = fastDateFormat2.getMaxLengthEstimate();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "M/d/yy h:mm a" + "'", str7.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0933");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0934");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.TimeZone timeZone4 = fastDateFormat0.getTimeZone();
        java.util.Locale locale5 = fastDateFormat0.getLocale();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat0.format(calendar6, stringBuffer7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0935");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 100, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0936");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.Object obj5 = fastDateFormat2.clone();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        java.util.Date date9 = fastDateFormat2.parse("Wednesday, December 31, 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 00:00:00 MST 1969");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0937");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.lang.Object obj5 = fastDateFormat4.clone();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((-1), timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0938");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0939");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(17, 0, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0940");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone7);
        java.lang.String str9 = fastDateFormat8.getPattern();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "h:mm:ss a z" + "'", str9.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0941");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        int int7 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat3.format(calendar8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0942");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone8);
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
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0943");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format(100L, stringBuffer5);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0944");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat5.format(calendar6);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0945");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone4);
        boolean boolean6 = fastDateFormat0.equals((java.lang.Object) (byte) 0);
        java.lang.String str8 = fastDateFormat0.format(1L);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 5:00 PM" + "'", str8.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0946");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.lang.Object obj8 = fastDateFormat1.clone();
        java.util.Locale locale9 = fastDateFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str6.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0947");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str5 = fastDateFormat3.format((long) (-1));
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat3.format(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "December 31, 1969 4:59:59 PM MST" + "'", str5.equals("December 31, 1969 4:59:59 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0948");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) 21);
        java.lang.String str5 = fastDateFormat2.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5:00:00 PM MST" + "'", str4.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h:mm:ss a z" + "'", str5.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0949");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = fastDateFormat2.parse("FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0950");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0951");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat3.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0952");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0953");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.Date date6 = fastDateFormat4.parse("Wednesday, December 31, 1969");
        java.lang.String str7 = fastDateFormat0.format(date6);
        java.lang.String str9 = fastDateFormat0.format((long) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/31/69 12:00 AM" + "'", str7.equals("12/31/69 12:00 AM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "12/31/69 5:00 PM" + "'", str9.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0954");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.String str6 = fastDateFormat4.getPattern();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(13, 17, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h:mm:ss a z" + "'", str5.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h:mm:ss a z" + "'", str6.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0955");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.lang.String str7 = fastDateFormat4.toString();
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0956");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format((long) (byte) 0, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0957");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = fastDateFormat1.format((java.lang.Object) timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0958");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        int int7 = fastDateFormat2.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0959");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 4:59 PM", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0960");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone2, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0961");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = fastDateFormat3.format(calendar5);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0962");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(17, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0963");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format((long) 31, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0964");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.toString();
        java.lang.Object obj6 = fastDateFormat3.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0965");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.lang.String str7 = fastDateFormat3.format((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "December 31, 1969 5:00:00 PM MST" + "'", str7.equals("December 31, 1969 5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0966");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        java.util.Date date3 = fastDateFormat1.parse("December 31, 1969");
        java.lang.String str5 = fastDateFormat1.format((long) (byte) 100);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat1.parse("December 31, 1969 5:00:00 PM MST", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Dec 31, 1969" + "'", str5.equals("Dec 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0967");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat1.format((long) 17, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0968");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z");
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0969");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        java.util.Locale locale9 = fastDateFormat6.getLocale();
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
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0970");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat3.format(calendar6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0971");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str5 = fastDateFormat3.format((long) 0);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(17, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0972");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 100, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0973");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.util.Locale locale8 = fastDateFormat6.getLocale();
        java.lang.String str9 = fastDateFormat6.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MMMM d, yyyy" + "'", str9.equals("MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0974");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat0.getPattern();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat0.format(calendar6, stringBuffer7);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0975");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0976");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        boolean boolean5 = fastDateFormat2.equals((java.lang.Object) str4);
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) ' ', 0, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0977");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a,en_US,America/Denver]", locale6);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0978");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0979");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        java.lang.String str5 = fastDateFormat0.getPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat0.parse("Dec 31, 1969 4:59:59 PM MST", parsePosition7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0980");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969 4:59:59 PM MST", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0981");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, (int) 'a', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0982");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 2);
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format(calendar6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0983");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 1);
        java.util.TimeZone timeZone4 = fastDateFormat1.getTimeZone();
        java.lang.String str5 = fastDateFormat1.getPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat1.parse("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0984");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = fastDateFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0985");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj5 = fastDateFormat4.clone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat1.format((java.lang.Object) locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0986");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 13, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0987");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.toString();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat3.format((long) 2, stringBuffer8);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0988");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        java.lang.Class<?> wildcardClass9 = locale6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0989");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat3.parse("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", parsePosition6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0990");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat1.parseObject("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0991");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0992");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        java.util.Date date5 = fastDateFormat3.parse("December 31, 1969");
        java.lang.String str6 = fastDateFormat0.format((java.lang.Object) date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 12:00 AM" + "'", str6.equals("12/31/69 12:00 AM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0993");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.getPattern();
        java.lang.String str7 = fastDateFormat3.format((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h:mm:ss a z" + "'", str5.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4:59:59 PM MST" + "'", str7.equals("4:59:59 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0994");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str5 = fastDateFormat3.format((long) 0);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 10, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0995");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.Date date6 = fastDateFormat4.parse("Wednesday, December 31, 1969");
        java.lang.String str7 = fastDateFormat0.format(date6);
        java.lang.String str8 = fastDateFormat0.toString();
        java.lang.String str9 = fastDateFormat0.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/31/69 12:00 AM" + "'", str7.equals("12/31/69 12:00 AM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str8.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "M/d/yy h:mm a" + "'", str9.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0996");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.lang.Object obj8 = fastDateFormat3.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0997");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(17, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0998");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 3);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test0999");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 10, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.test1000");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, locale7);
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
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }
}

