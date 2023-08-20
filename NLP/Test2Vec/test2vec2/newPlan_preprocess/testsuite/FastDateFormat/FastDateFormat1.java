package FastDateFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FastDateFormat1 {

    public static boolean debug = false;

    @Test
    public void FastDateFormat0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0501");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0502");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone2, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0503");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
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
    public void FastDateFormat0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0504");
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
    public void FastDateFormat0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0505");
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
    public void FastDateFormat0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0506");
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
    public void FastDateFormat0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0507");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, (int) (short) 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0508");
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
    public void FastDateFormat0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0509");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.TimeZone timeZone6 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0510");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0511");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0512");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Date date4 = fastDateFormat2.parse("Wednesday, December 31, 1969");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0513");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0514");
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
    public void FastDateFormat0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0515");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0516");
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
    public void FastDateFormat0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0517");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0518");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0519");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0520");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.lang.String str8 = fastDateFormat5.format((long) 2);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0521");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0522");
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
    public void FastDateFormat0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0523");
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
    public void FastDateFormat0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0524");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0525");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone5);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0526");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0527");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str5 = fastDateFormat3.format((long) (short) 1);
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat3);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0528");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0529");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0530");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.util.Date date7 = null;
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0531");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0532");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0533");
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
    public void FastDateFormat0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0534");
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
    public void FastDateFormat0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0535");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0536");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0537");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0538");
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
    public void FastDateFormat0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0539");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.TimeZone timeZone4 = fastDateFormat0.getTimeZone();
        java.lang.String str5 = fastDateFormat0.toString();
        java.util.Date date6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0540");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0541");
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
    public void FastDateFormat0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0542");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        int int3 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0543");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
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
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "M/d/yy h:mm a" + "'", str1.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0544");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0545");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0546");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.TimeZone timeZone4 = fastDateFormat0.getTimeZone();
        java.lang.String str5 = fastDateFormat0.toString();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0547");
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
    public void FastDateFormat0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0548");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0549");
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
    public void FastDateFormat0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0550");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1);
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
    public void FastDateFormat0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0551");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        java.lang.String str4 = fastDateFormat1.getPattern();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0552");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0553");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0554");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0555");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0556");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0557");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0558");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
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
    public void FastDateFormat0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0559");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0560");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str4 = fastDateFormat1.format((-1L));
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0561");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0562");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0563");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0564");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0565");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str5 = fastDateFormat3.format((long) (short) 1);
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat3);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0566");
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
    public void FastDateFormat0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0567");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0568");
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
    public void FastDateFormat0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0569");
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
    public void FastDateFormat0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0570");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0571");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0572");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0573");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0574");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969 4:59:59 PM MST", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0575");
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
    public void FastDateFormat0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0576");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0577");
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
    public void FastDateFormat0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0578");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str4 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0579");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone4);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0580");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.lang.String str5 = fastDateFormat0.getPattern();
        java.util.Date date6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0581");
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
    public void FastDateFormat0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0582");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.Object obj3 = fastDateFormat0.clone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0583");
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
    public void FastDateFormat0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0584");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0585");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0586");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0587");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0588");
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
    public void FastDateFormat0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0589");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str4 = fastDateFormat2.getPattern();
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0590");
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
    public void FastDateFormat0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0591");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str4 = fastDateFormat2.format(0L);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5:00:00 PM MST" + "'", str4.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0592");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 1);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0593");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0594");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0595");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0596");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0597");
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
    public void FastDateFormat0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0598");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0599");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
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
    public void FastDateFormat0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0600");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.getPattern();
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0601");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0602");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale5);
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
    public void FastDateFormat0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0603");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0604");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        java.lang.String str4 = fastDateFormat1.format((long) (short) 10);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0605");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0606");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 2);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0607");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.Date date6 = fastDateFormat4.parse("Wednesday, December 31, 1969");
        java.lang.String str7 = fastDateFormat0.format(date6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0608");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0609");
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
    public void FastDateFormat0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0610");
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
    public void FastDateFormat0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0611");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
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
    public void FastDateFormat0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0612");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0613");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0614");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0615");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
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
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void FastDateFormat0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0616");
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
    public void FastDateFormat0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0617");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0618");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0619");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0620");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0621");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0622");
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
    public void FastDateFormat0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0623");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0624");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0625");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0626");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0627");
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
    public void FastDateFormat0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0628");
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
    public void FastDateFormat0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0629");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0630");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0631");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0632");
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
    public void FastDateFormat0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0633");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0634");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0635");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0636");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0637");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0638");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0639");
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
    public void FastDateFormat0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0640");
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
    public void FastDateFormat0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0641");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0642");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0643");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0644");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0645");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0646");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.lang.String str6 = fastDateFormat4.format((long) 100);
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0647");
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
    public void FastDateFormat0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0648");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '4', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0649");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.lang.Object obj4 = fastDateFormat0.clone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0650");
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
    public void FastDateFormat0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0651");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0652");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0653");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone6);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0654");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
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
    public void FastDateFormat0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0655");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0656");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(13, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0657");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 0);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0658");
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
    public void FastDateFormat0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0659");
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
    public void FastDateFormat0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0660");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0661");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0662");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (byte) 10);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0663");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0664");
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
    public void FastDateFormat0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0665");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0666");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        java.util.Locale locale6 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0667");
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
    public void FastDateFormat0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0668");
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
    public void FastDateFormat0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0669");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.lang.String str3 = fastDateFormat1.format((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0670");
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
    public void FastDateFormat0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0671");
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
    public void FastDateFormat0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0672");
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
    public void FastDateFormat0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0673");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969 4:59:59 PM MST");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0674");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0675");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0676");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.String str3 = fastDateFormat0.getPattern();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0677");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
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
    public void FastDateFormat0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0678");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0679");
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
    public void FastDateFormat0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0680");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.getPattern();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0681");
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
    public void FastDateFormat0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0682");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        boolean boolean6 = fastDateFormat4.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0683");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0684");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0685");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0686");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0687");
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
    public void FastDateFormat0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0688");
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
    public void FastDateFormat0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0689");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0690");
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
    public void FastDateFormat0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0691");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0692");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        int int5 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.Object obj6 = fastDateFormat1.clone();
        java.util.TimeZone timeZone7 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0693");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0694");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.util.Locale locale5 = fastDateFormat0.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0695");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0696");
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
    public void FastDateFormat0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0697");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0698");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0699");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0700");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        java.util.Locale locale6 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0701");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 1);
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0702");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.String str3 = fastDateFormat0.getPattern();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0703");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0704");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0705");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        java.lang.String str7 = fastDateFormat3.toString();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0706");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str4 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0707");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0708");
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
    public void FastDateFormat0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0709");
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
    public void FastDateFormat0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0710");
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
    public void FastDateFormat0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0711");
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
    public void FastDateFormat0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0712");
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
    public void FastDateFormat0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0713");
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
    public void FastDateFormat0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0714");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0715");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0716");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0717");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0718");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0719");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0720");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0721");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        java.lang.String str3 = fastDateFormat1.format(100L);
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0722");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0723");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = fastDateFormat0.equals((java.lang.Object) fastDateFormat4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0724");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0725");
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
    public void FastDateFormat0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0726");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0727");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0728");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0729");
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
    public void FastDateFormat0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0730");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0731");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0732");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0733");
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
    public void FastDateFormat0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0734");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0735");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0736");
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
    public void FastDateFormat0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0737");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0738");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0739");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone4);
        boolean boolean6 = fastDateFormat0.equals((java.lang.Object) (byte) 0);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0740");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0741");
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
    public void FastDateFormat0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0742");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 2);
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
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0743");
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
    public void FastDateFormat0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0744");
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
    public void FastDateFormat0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0745");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.String str3 = fastDateFormat2.toString();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0746");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0747");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0748");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0749");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0750");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0751");
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
    public void FastDateFormat0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0752");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0753");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone5);
        java.lang.String str7 = fastDateFormat6.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0754");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0755");
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
    public void FastDateFormat0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0756");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0757");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0758");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.lang.String str3 = fastDateFormat2.getPattern();
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MMMM d, yyyy h:mm:ss a" + "'", str3.equals("MMMM d, yyyy h:mm:ss a"));
    }

    @Test
    public void FastDateFormat0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0759");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.lang.String str6 = fastDateFormat4.format((long) 100);
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0760");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0761");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = fastDateFormat0.equals(obj2);
        java.lang.String str5 = fastDateFormat0.format((long) (byte) 0);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0762");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format(1L);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0763");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.lang.String str7 = fastDateFormat5.format((long) 100);
        java.util.Locale locale8 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0764");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0765");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone5);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0766");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str2 = fastDateFormat1.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        boolean boolean6 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0767");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone5);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0768");
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
    public void FastDateFormat0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0769");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.TimeZone timeZone6 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0770");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0771");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0772");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        boolean boolean4 = fastDateFormat1.equals((java.lang.Object) str3);
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.Locale locale6 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0773");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str4 = fastDateFormat2.format((long) 0);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0774");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format((long) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0775");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 1);
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0776");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0777");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0778");
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
    public void FastDateFormat0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0779");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.String str3 = fastDateFormat0.getPattern();
        java.util.TimeZone timeZone5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0780");
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
    public void FastDateFormat0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0781");
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
    public void FastDateFormat0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0782");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0783");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 100, timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0784");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.Object obj5 = fastDateFormat3.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0785");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0786");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str4 = fastDateFormat1.format((-1L));
        java.lang.String str5 = fastDateFormat1.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0787");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0788");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone3, locale4);
        java.lang.Object obj6 = fastDateFormat5.clone();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0789");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 14, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0790");
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
    public void FastDateFormat0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0791");
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
    public void FastDateFormat0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0792");
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
    public void FastDateFormat0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0793");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0794");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.Date date4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0795");
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
    public void FastDateFormat0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0796");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.toString();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0797");
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
    public void FastDateFormat0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0798");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        java.lang.String str4 = fastDateFormat1.getPattern();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0799");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone5);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0800");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0801");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0802");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.lang.String str7 = fastDateFormat5.format((long) 100);
        java.util.Locale locale8 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0803");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0804");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0805");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.lang.String str5 = fastDateFormat3.toString();
        java.lang.String str7 = fastDateFormat3.format((long) 1);
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
    public void FastDateFormat0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0806");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0807");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0808");
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
    public void FastDateFormat0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0809");
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
    public void FastDateFormat0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0810");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) "MMMM d, yyyy");
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
    public void FastDateFormat0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0811");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0812");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0813");
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
    public void FastDateFormat0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0814");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.lang.String str4 = fastDateFormat0.toString();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0815");
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
    public void FastDateFormat0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0816");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0817");
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
    public void FastDateFormat0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0818");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.lang.Object obj5 = fastDateFormat2.clone();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0819");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0820");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0821");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0822");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0823");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0824");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0825");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        java.lang.Class<?> wildcardClass2 = fastDateFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FastDateFormat0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0826");
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
    public void FastDateFormat0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0827");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0828");
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
    public void FastDateFormat0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0829");
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
    public void FastDateFormat0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0830");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
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
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0831");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0832");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.Object obj6 = fastDateFormat4.clone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0833");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0834");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
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
    public void FastDateFormat0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0835");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 1);
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0836");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969 5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0837");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0838");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 1);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0839");
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
    public void FastDateFormat0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0840");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        boolean boolean4 = fastDateFormat0.equals((java.lang.Object) "M/d/yy h:mm a");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void FastDateFormat0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0841");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(31, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0842");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0843");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0844");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0845");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str7 = fastDateFormat6.getPattern();
        java.lang.Object obj8 = fastDateFormat6.clone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0846");
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
    public void FastDateFormat0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0847");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0848");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0849");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 0);
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0850");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0851");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0852");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0853");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0854");
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
    public void FastDateFormat0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0855");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0856");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        java.util.Date date3 = fastDateFormat1.parse("December 31, 1969");
        java.lang.String str5 = fastDateFormat1.format((long) (byte) 100);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0857");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0858");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0859");
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
    public void FastDateFormat0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0860");
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
    public void FastDateFormat0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0861");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0862");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0863");
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
    public void FastDateFormat0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0864");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0865");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.String str7 = fastDateFormat4.format(0L);
        java.util.Locale locale8 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0866");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0867");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0868");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.lang.String str5 = fastDateFormat3.format((long) (short) 1);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0869");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0870");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0871");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        int int5 = fastDateFormat1.getMaxLengthEstimate();
        int int6 = fastDateFormat1.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0872");
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
    public void FastDateFormat0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0873");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        java.lang.String str7 = fastDateFormat5.format((long) (byte) 1);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0874");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
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
    public void FastDateFormat0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0875");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0876");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.TimeZone timeZone6 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0877");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0878");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0879");
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
    public void FastDateFormat0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0880");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0881");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0882");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0883");
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
    public void FastDateFormat0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0884");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0885");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 3);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0886");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str4 = fastDateFormat2.format((long) (short) 0);
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0887");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0888");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0889");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0890");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0891");
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
    public void FastDateFormat0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0892");
        java.util.TimeZone timeZone2 = null;
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.lang.Object obj7 = fastDateFormat5.clone();
        java.util.Locale locale8 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0893");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        java.lang.Object obj7 = fastDateFormat6.clone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0894");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0);
        java.lang.Class<?> wildcardClass3 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FastDateFormat0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0895");
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
    public void FastDateFormat0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0896");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0897");
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
    public void FastDateFormat0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0898");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        boolean boolean6 = fastDateFormat2.equals((java.lang.Object) locale4);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0899");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(32, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0900");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0901");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.lang.String str6 = fastDateFormat2.getPattern();
        java.util.Date date7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0902");
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
    public void FastDateFormat0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0903");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0904");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0905");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(13, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0906");
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
    public void FastDateFormat0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0907");
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
    public void FastDateFormat0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0908");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.format((long) 13);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0909");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.lang.String str5 = fastDateFormat0.getPattern();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0910");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.String str2 = fastDateFormat1.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0911");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0912");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0913");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0914");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        int int5 = fastDateFormat0.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat0.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0915");
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
    public void FastDateFormat0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0916");
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
    public void FastDateFormat0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0917");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
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
    public void FastDateFormat0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0918");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        boolean boolean5 = fastDateFormat2.equals((java.lang.Object) str4);
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0919");
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
    public void FastDateFormat0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0920");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0921");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0922");
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
    public void FastDateFormat0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0923");
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
    public void FastDateFormat0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0924");
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
    public void FastDateFormat0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0925");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0926");
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
    public void FastDateFormat0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0927");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.Locale locale8 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0928");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0929");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale6);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0930");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0931");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 0);
        java.lang.Object obj4 = fastDateFormat1.clone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0932");
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
    public void FastDateFormat0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0933");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0934");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.TimeZone timeZone4 = fastDateFormat0.getTimeZone();
        java.util.Locale locale5 = fastDateFormat0.getLocale();
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
    public void FastDateFormat0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0935");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0936");
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
    public void FastDateFormat0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0937");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.lang.Object obj5 = fastDateFormat4.clone();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0938");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
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
    public void FastDateFormat0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0939");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0940");
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
    public void FastDateFormat0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0941");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        int int7 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0942");
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
    public void FastDateFormat0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0943");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0944");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0945");
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
    public void FastDateFormat0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0946");
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
    public void FastDateFormat0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0947");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str5 = fastDateFormat3.format((long) (-1));
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0948");
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
    public void FastDateFormat0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0949");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0950");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0951");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0952");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0953");
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
    public void FastDateFormat0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0954");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.String str6 = fastDateFormat4.getPattern();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0955");
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
    public void FastDateFormat0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0956");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale2);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0957");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0958");
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
    public void FastDateFormat0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0959");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0960");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone2, locale7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0961");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0962");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0963");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0964");
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
    public void FastDateFormat0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0965");
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
    public void FastDateFormat0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0966");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        java.util.Date date3 = fastDateFormat1.parse("December 31, 1969");
        java.lang.String str5 = fastDateFormat1.format((long) (byte) 100);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0967");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0968");
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
    public void FastDateFormat0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0969");
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
    public void FastDateFormat0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0970");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0971");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str5 = fastDateFormat3.format((long) 0);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0972");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0973");
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
    public void FastDateFormat0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0974");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
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
    public void FastDateFormat0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0975");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0976");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        boolean boolean5 = fastDateFormat2.equals((java.lang.Object) str4);
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0977");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0978");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0979");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        java.lang.String str5 = fastDateFormat0.getPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0980");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone7);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0981");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, (int) 'a', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0982");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 2);
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
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0983");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 1);
        java.util.TimeZone timeZone4 = fastDateFormat1.getTimeZone();
        java.lang.String str5 = fastDateFormat1.getPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0984");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0985");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj5 = fastDateFormat4.clone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0986");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0987");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.toString();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0988");
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
    public void FastDateFormat0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0989");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0990");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0991");
        // The following exception was thrown during execution in FastDateFormat generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0992");
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
    public void FastDateFormat0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0993");
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
    public void FastDateFormat0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0994");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str5 = fastDateFormat3.format((long) 0);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0995");
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
    public void FastDateFormat0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0996");
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
    public void FastDateFormat0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0997");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0998");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 3);
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
    public void FastDateFormat0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat0999");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        // The following exception was thrown during execution in FastDateFormat generation
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
    public void FastDateFormat1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat1.FastDateFormat1000");
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

